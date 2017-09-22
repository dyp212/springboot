package com.test.spring.boot.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.spring.boot.common.Tools;
import com.test.spring.boot.dao.newDao.PgtInboundNoticeDetailsMapper;
import com.test.spring.boot.dao.newDao.PgtInboundNoticeMapper;
import com.test.spring.boot.dao.newDao.PgtInboundNoticeStockBatchMapper;
import com.test.spring.boot.dao.newDao.PgtOrderGoodsMapper;
import com.test.spring.boot.dao.newDao.PgtOrderMapper;
import com.test.spring.boot.dao.newDao.PgtOrderStockBatchMapper;
import com.test.spring.boot.dao.newDao.PgtOutboundDetailMapper;
import com.test.spring.boot.dao.newDao.PgtOutboundMapper;
import com.test.spring.boot.dao.newDao.PgtOutboundNoticeDetailMapper;
import com.test.spring.boot.dao.newDao.PgtOutboundNoticeMapper;
import com.test.spring.boot.dao.newDao.PgtStoreShopMapper;
import com.test.spring.boot.dao.newDao.SerialConfigMapper;
import com.test.spring.boot.dao.newDao.SzyGoodsSku6Mapper;
import com.test.spring.boot.dao.newDao.SzyStockGoods6Mapper;
import com.test.spring.boot.dao.newDao.SzyStoreMapper;
import com.test.spring.boot.domain.Result;
import com.test.spring.boot.entity.PgtInboundNotice;
import com.test.spring.boot.entity.PgtInboundNoticeDetails;
import com.test.spring.boot.entity.PgtInboundNoticeStockBatch;
import com.test.spring.boot.entity.PgtOrder;
import com.test.spring.boot.entity.PgtOrderGoods;
import com.test.spring.boot.entity.PgtOrderStockBatch;
import com.test.spring.boot.entity.PgtOutbound;
import com.test.spring.boot.entity.PgtOutboundDetail;
import com.test.spring.boot.entity.PgtOutboundNotice;
import com.test.spring.boot.entity.PgtOutboundNoticeDetail;
import com.test.spring.boot.entity.PgtStoreShop;
import com.test.spring.boot.entity.SerialConfig;
import com.test.spring.boot.entity.SzyGoodsSku6;
import com.test.spring.boot.entity.SzyOrder;
import com.test.spring.boot.entity.SzyOrderGoods;
import com.test.spring.boot.entity.SzyStockGoods6;
import com.test.spring.boot.entity.SzyStore;
import com.test.spring.boot.entity.SzyStoreExample;

@Service
public class StoreService {
	private final static Logger logger = Logger.getLogger(StoreService.class);

	@Autowired
	private PgtInboundNoticeMapper pgtInboundNoticeMapper;

	@Autowired
	private PgtInboundNoticeDetailsMapper pgtInboundNoticeDetailsMapper;

	@Autowired
	private PgtOutboundNoticeMapper pgtOutboundNoticeMapper;

	@Autowired
	private PgtOutboundNoticeDetailMapper pgtOutboundNoticeDetailMapper;

	@Autowired
	private SzyStoreMapper szyStoreMapper;

	@Autowired
	private SzyStockGoods6Mapper szyStockGoods6Mapper;

	@Autowired
	private SzyGoodsSku6Mapper szyGoodsSku6Mapper;

	@Autowired
	private PgtOutboundMapper outboundMapper;

	@Autowired
	private PgtOutboundDetailMapper outboundDetailMapper;

	@Autowired
	private PgtOrderMapper pgtOrderMapper;

	@Autowired
	private PgtOrderGoodsMapper pgtOrderGoodsMapper;

	@Autowired
	private PgtInboundNoticeStockBatchMapper pgtInboundNoticeStockBatchMapper;

	@Autowired
	private PgtOrderStockBatchMapper pgtOrderStockBatchMapper;

	@Autowired
	private SerialConfigMapper serialConfigMapper;

	@Autowired
	private PgtStoreShopMapper pgtStoreShopMapper;

	@Autowired
	private OrderService orderService;

	/**
	 * 获取编码
	 * 
	 * @param codeType
	 * @throws Exception
	 */
	public String getSerialCode(String codeType) throws Exception {
		if (StringUtils.isNotEmpty(codeType)) {
			List<SerialConfig> list = serialConfigMapper.selectList(codeType);
			String code_prefix = list.get(0).getCodePrefix();
			Integer code_length = list.get(0).getCodeLength();
			Integer latest_no = list.get(0).getLatestNo() + 1;
			if (StringUtils.isNotEmpty(code_prefix) && code_length != null && latest_no != null) {
				String code = "";
				code += code_prefix;
				int count = latest_no.toString().length();
				if (count <= code_length) {
					for (int i = 0; i < code_length - count; i++) {
						code += "0";
					}
					code += latest_no.toString();
					// 跟新code到数据库
					UpSerialCode(codeType, latest_no);
					return code;
				}
			}
		}
		return null;
	}

	/*
	 * function:更新
	 */
	public String UpSerialCode(String codeType, Integer latest_no) throws Exception {
		int rows = serialConfigMapper.updateBySome(latest_no, codeType);
		return null;
	}

	/*
	 * function:拒收（点击拒收按钮）,修改订单状态未拒收
	 */

	public Result insertInBoundNotice(PgtOrder pgt_order, List<PgtOrderGoods> pgt_orderGoods, String record_id) {
		Result rst = new Result();

		Integer shop_id = pgt_order.getShop_id();
		List<PgtStoreShop> list = pgtStoreShopMapper.selectList(shop_id);

		List<SzyStore> listStore = szyStoreMapper.selectList(String.valueOf(list.get(0).getStoreId()));

		PgtInboundNotice inboundNotice = new PgtInboundNotice();
		inboundNotice.setStoreSn(listStore.get(0).getStoreSn());
		inboundNotice.setStoreName(list.get(0).getStoreName());
		inboundNotice.setBillType(6);// 拒收到货

		String NoticeCode = null;
		try {
			NoticeCode = getSerialCode("inbound_notice");
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (StringUtils.isEmpty(NoticeCode)) {
			inboundNotice.setInboundNoticeCode("null");
		} else {
			inboundNotice.setInboundNoticeCode(NoticeCode);
		}

		inboundNotice.setPurchaseCode(String.valueOf(pgt_order.getOrder_sn()));
		inboundNotice.setPreArrivalTime(new Date());
		inboundNotice.setStatus((byte) 0);
		inboundNotice.setArrivalTime(new Date());
		inboundNotice.setCreateTime(new Date());
		inboundNotice.setUpdateTime(new Date());
		int row = pgtInboundNoticeMapper.insert(inboundNotice);

		for (PgtOrderGoods orderGood : pgt_orderGoods) {
			PgtInboundNoticeDetails iboundNoticeDetails = new PgtInboundNoticeDetails();

			if (StringUtils.isEmpty(NoticeCode)) {
				iboundNoticeDetails.setInboundCode("none");
			} else {

				iboundNoticeDetails.setInboundCode(NoticeCode);
			}
			iboundNoticeDetails.setPurchaseCode(String.valueOf(pgt_order.getOrder_sn()));
			iboundNoticeDetails.setPurchaseDetailId(Long.valueOf(orderGood.getRecord_id()));

			// SzyGoodsSku6Example exam1 = new SzyGoodsSku6Example();
			// SzyGoodsSku6Example.Criteria critia1 = exam1.createCriteria();
			// critia1.andSkuIdEqualTo(orderGood.getSku_id());
			List<SzyGoodsSku6> list1 = szyGoodsSku6Mapper.selectList(orderGood.getGoods_sn());
			if (list1.size() <= 0) {
				System.out.println("没有这个商品");
				iboundNoticeDetails.setSkuId(99999);
				iboundNoticeDetails.setSkuName("none");
				iboundNoticeDetails.setSkuEncode("none");
			} else {
				iboundNoticeDetails.setSkuId(list1.get(0).getSkuId());
				iboundNoticeDetails.setSkuName(list1.get(0).getSkuName());
				iboundNoticeDetails.setSkuEncode(list1.get(0).getSkuEncode());
			}

			iboundNoticeDetails.setSpec(orderGood.getSpec_info());
			iboundNoticeDetails.setPreArrivalQuantity(orderGood.getGoods_number());
			iboundNoticeDetails.setGoodQuantity(orderGood.getGoods_number());
			iboundNoticeDetails.setCreateTime(new Date());

			int rowa = pgtInboundNoticeDetailsMapper.insert(iboundNoticeDetails);

			// 插入pgt_inbound_notice_stock_batch
			PgtInboundNoticeStockBatch stockBatch = new PgtInboundNoticeStockBatch();

			if (StringUtils.isEmpty(NoticeCode)) {
				stockBatch.setInboundNoticeCode("none");
			} else {
				stockBatch.setInboundNoticeCode(NoticeCode);
			}

			stockBatch.setNoticeDetailId(Long.valueOf(orderGood.getRecord_id()));
			stockBatch.setSkuId(orderGood.getSku_id());
			stockBatch.setSkuName(list1.get(0).getSkuName());
			stockBatch.setSkuEncode(list1.get(0).getSkuEncode());
			stockBatch.setSpec(orderGood.getSpec_info());

			// PgtOrderStockBatchExample exam2 = new PgtOrderStockBatchExample();
			// PgtOrderStockBatchExample.Criteria critia2 = exam2.createCriteria();
			// critia2.andRecordIdEqualTo(2);
			List<PgtOrderStockBatch> list2 = pgtOrderStockBatchMapper.selectList(Integer.valueOf(record_id));
			if (list2.size() <= 0) {
				stockBatch.setBatchCode("none");
				stockBatch.setQuantity(0d);
				stockBatch.setUnitName("none");
				stockBatch.setSpec("none");
			} else {
				stockBatch.setBatchCode(list2.get(0).getBatchCode());
				stockBatch.setQuantity(Double.valueOf(list2.get(0).getQuantity()));
				stockBatch.setUnitName(list2.get(0).getUnitName());
				stockBatch.setSpec(list2.get(0).getSpec());
			}

			int rowb = pgtInboundNoticeStockBatchMapper.insert(stockBatch);

		}

		return rst;
	}

	/*
	 * function:退货,修改订单状态退货
	 */
	public Result insertBackGoods(SzyOrder szy_order, List<SzyOrderGoods> szy_orderGoods) {
		Result rst = new Result();

		// 往erp相关表增加数据
		String noticeCode = null;
		try {
			noticeCode = Tools.getSerialCode("outbound_notice");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Integer shop_id = szy_order.getShop_id();
		SzyStoreExample exam = new SzyStoreExample();
		SzyStoreExample.Criteria critia = exam.createCriteria();
		critia.andStoreIdEqualTo(shop_id);
		List<SzyStore> list = szyStoreMapper.selectByExample(exam);

		PgtInboundNotice inboundNotice = new PgtInboundNotice();

		inboundNotice.setBillType(4);
		inboundNotice.setPreArrivalTime(new Date());
		inboundNotice.setArrivalTime(new Date());
		inboundNotice.setCreateTime(new Date());
		inboundNotice.setUpdateTime(new Date());
		int row = pgtInboundNoticeMapper.insert(inboundNotice);
		if (row == 1) {
			System.out.println("success");
		}

		PgtInboundNoticeDetails iboundNoticeDetails = new PgtInboundNoticeDetails();
		pgtInboundNoticeDetailsMapper.insert(iboundNoticeDetails);

		return rst;
	}

	/*
	 * function:订单推送(付款完成)
	 */
	public Result insertOutBoundNotice(PgtOrder pgt_order, List<PgtOrderGoods> pgt_orderGoods) {
		Result rst = new Result();

		// 往erp的订单表和订单详情表插入数据
		int r = pgtOrderMapper.insert(pgt_order);

		for (PgtOrderGoods orderGoods : pgt_orderGoods) {
			int rr = pgtOrderGoodsMapper.insert(orderGoods);
		}

		// 往erp出库通知单和出库通知单详情里增加数据增加数据
		PgtOutboundNotice outboundNotice = new PgtOutboundNotice();
		String noticeCode = null;
		try {
			noticeCode = getSerialCode("outbound_notice");
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (StringUtils.isEmpty(noticeCode)) {
			outboundNotice.setOutboundNoticeCode("none");
		} else {
			outboundNotice.setOutboundNoticeCode(noticeCode);
		}

		Integer shop_id = pgt_order.getShop_id();
		List<PgtStoreShop> listStoreShop = pgtStoreShopMapper.selectList(shop_id);
		List<SzyStore> listStore= szyStoreMapper.selectList(String.valueOf(listStoreShop.get(0).getStoreId()));
		
		outboundNotice.setStoreSn(listStore.get(0).getStoreSn());
		outboundNotice.setStoreName(listStore.get(0).getStoreName());
		outboundNotice.setBillType((byte) 5);
		outboundNotice.setPurchaseCode(pgt_order.getOrder_sn());
		outboundNotice.setStatus((byte) 0);
		outboundNotice.setCreateTime(new Date());
		outboundNotice.setUpdateTime(new Date());
		int row = pgtOutboundNoticeMapper.insert(outboundNotice);

		for (PgtOrderGoods orderGoods : pgt_orderGoods) {
			PgtOutboundNoticeDetail outboundNoticeDetail = new PgtOutboundNoticeDetail();
			outboundNoticeDetail.setOutboundNoticeCode(noticeCode);
			outboundNoticeDetail.setPurchaseCode(pgt_order.getOrder_sn());
			outboundNoticeDetail.setPurchaseDetailId(Long.valueOf(orderGoods.getRecord_id()));

			// SzyGoodsSku6Example exam1 = new SzyGoodsSku6Example();
			// SzyGoodsSku6Example.Criteria critia1 = exam1.createCriteria();
			// critia1.andSkuBarcodeEqualTo(orderGoods.getGoods_sn());
			List<SzyGoodsSku6> list1 = szyGoodsSku6Mapper.selectList(orderGoods.getGoods_sn());
			if (list1.size() <= 0) {
				System.out.println("没有这个商品");
				outboundNoticeDetail.setSkuId(99999);
				outboundNoticeDetail.setSkuName("none");
				outboundNoticeDetail.setSkuEncode("none");
			} else {
				outboundNoticeDetail.setSkuId(list1.get(0).getSkuId());
				outboundNoticeDetail.setSkuName(list1.get(0).getSkuName());
				outboundNoticeDetail.setSkuEncode(list1.get(0).getSkuEncode());
			}

			outboundNoticeDetail.setSpec(orderGoods.getSpec_info());
			outboundNoticeDetail.setPreSendQuantity(orderGoods.getGoods_number());// 订单详情数量
			outboundNoticeDetail.setSendQuantity(0);
			outboundNoticeDetail.setStatus((byte) 0);
			outboundNoticeDetail.setCreateTime(new Date());
			pgtOutboundNoticeDetailMapper.insert(outboundNoticeDetail);
		}

		return rst;
	}

	/*
	 * function:订单取消（点击取消按钮的时候）
	 */
	public int cancelOrder(String purchaseCode) {
		Result rst = new Result();

		// 往erp相关表增加数据
		PgtOutboundNotice outboundNotice = new PgtOutboundNotice();
		outboundNotice.setPurchaseCode(purchaseCode);
		outboundNotice.setStatus((byte) 1);
		outboundNotice.setUpdateTime(new Date());
		int row = pgtOutboundNoticeMapper.updateStatus(outboundNotice);

		return row;
	}

	public PgtOutboundNotice selectByPurchaseCode(String purchaseCode) {

		// 往erp相关表增加数据
		PgtOutboundNotice outboundNotice = new PgtOutboundNotice();
		outboundNotice.setPurchaseCode(purchaseCode);
		outboundNotice.setStatus((byte) 1);
		outboundNotice.setUpdateTime(new Date());
		PgtOutboundNotice rst = pgtOutboundNoticeMapper.selectByPurchaseCode(purchaseCode);
		return rst;
	}

	/*
	 * function:客户收货（点击确认收货按钮）
	 */
	public int confirmDelivery(String purchaseCode) {
		Result rst = new Result();

		// 生成出库通知单

		int row = 0;
		if (row == 1) {
			Integer storeId = szyStockGoods6Mapper.storeIdByPurchaseCode(purchaseCode);
			List<PgtOutboundNoticeDetail> list = pgtOutboundNoticeDetailMapper.findByPurchaseCode(purchaseCode);
			if (list != null) {
				for (PgtOutboundNoticeDetail detail : list) {
					Integer sendQuantity = detail.getSendQuantity();
					SzyStockGoods6 szyStockGoods6 = new SzyStockGoods6();
					szyStockGoods6.setGoodsNumber(Double.valueOf(sendQuantity.toString()));
					szyStockGoods6.setSkuId(detail.getSkuId());
					szyStockGoods6.setStoreId(storeId);
					szyStockGoods6Mapper.updateStoreNum(szyStockGoods6);
				}
			}
		}

		return row;
	}

	public int confirmDelivery(PgtOrder szy_order, List<PgtOrderGoods> szy_orderGoods) throws Exception {
		String outBoundCode = getSerialCode(Tools.OUTBOUND_CODE);
		String orderId = szy_order.getOrder_id().toString();
		Integer shop_id = szy_order.getShop_id();
		List<PgtStoreShop> list1 = pgtStoreShopMapper.selectList(shop_id);
		
		List<SzyStore> list2= szyStoreMapper.selectList(String.valueOf(list1.get(0).getStoreId()));

		List<SzyStore> list3 = szyStoreMapper.selectList(String.valueOf(list2.get(0).getLogisticStoreId()));

		if (list1 == null || list1.size() == 0)
			return -1;
		if (list2 == null || list2.size() == 0)
			return -1;
		String storeName = list3.get(0).getStoreName();
		String storeSn = list3.get(0).getStoreSn();
		Integer storeId = list3.get(0).getStoreId();
		Date nDate = new Date();
		String user = "";
		PgtOutbound outbound = new PgtOutbound();

		List<PgtOrder> listOrder = orderService.queryOrder(Integer.valueOf(orderId));
		if (listOrder == null || listOrder.size() == 0)
			return -1;

		outbound.setPurchaseCode(listOrder.get(0).getOrder_sn());
		outbound.setBusinessTime(nDate);
		outbound.setOutBoundCode(outBoundCode);
		outbound.setStoreName(storeName);
		outbound.setStoreSn(storeSn);
		outbound.setStatus((byte) 0);
		outbound.setType((byte) 5);
		outbound.setOutboundNoticeCode("");
		outbound.setCreateby("");//确认收货人？
		outbound.setCreateTime(nDate);
		outbound.setUpdateby(user);//确认收货人？
		outbound.setUpdateTime(nDate);
		int insert = outboundMapper.insert(outbound);
		if (insert == 1) {
			for (PgtOrderGoods goods : szy_orderGoods) {
				List<SzyGoodsSku6> listGoodsSku = szyGoodsSku6Mapper.selectList(goods.getGoods_sn());
				if (listGoodsSku.size() <= 0) {
					return -1;
				}
				Integer quantity = goods.getGoods_number();
				Integer recordId = goods.getRecord_id();
				PgtOutboundDetail detail = new PgtOutboundDetail();
				detail.setOutboundCode(outBoundCode);
				detail.setPurchaseCode(listOrder.get(0).getOrder_sn());
				detail.setPurchaseDetailId(recordId.longValue());
				detail.setQuantity(quantity);
				detail.setSkuEncode(String.valueOf(listGoodsSku.get(0).getSkuEncode()));
				detail.setSkuId(listGoodsSku.get(0).getSkuId());
				detail.setSkuName(listGoodsSku.get(0).getSkuName());
				detail.setSpec("");
				detail.setStatus((byte) 0);
				detail.setOutboundNoticeCode("");
				detail.setOutboundNoticeDetailId(0l);
				detail.setCreateby(user);
				detail.setCreateTime(nDate);
				detail.setUpdateby(user);
				detail.setUpdateTime(nDate);
				outboundDetailMapper.insert(detail);
				// 更新库存
				SzyStockGoods6 szyStockGoods6 = new SzyStockGoods6();
				szyStockGoods6.setGoodsNumber((double) (0 - quantity));
				szyStockGoods6.setSkuId(listGoodsSku.get(0).getSkuId());
				szyStockGoods6.setStoreId(list3.get(0).getStoreId());
				szyStockGoods6Mapper.updateStoreNum(szyStockGoods6);
			}
		}
		return insert;
	}

}
