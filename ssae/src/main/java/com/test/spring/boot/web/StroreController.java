package com.test.spring.boot.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.test.spring.boot.common.ResultResponse;
import com.test.spring.boot.dao.newDao.PgtOrderMapper;
import com.test.spring.boot.entity.PgtOrder;
import com.test.spring.boot.entity.PgtOrderGoods;
import com.test.spring.boot.entity.PgtOutboundNotice;
import com.test.spring.boot.entity.SzyOrder;
import com.test.spring.boot.entity.SzyOrderGoods;
import com.test.spring.boot.service.OrderService;
import com.test.spring.boot.service.StoreService;

@RequestMapping("store")
@RestController
public class StroreController {

	private final static Logger logger = Logger.getLogger(StroreController.class);

	@Autowired
	private StoreService storeService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private PgtOrderMapper pgtOrderMapper;

	/*
	 * funciton：拒收
	 */
	@RequestMapping("/noreceive")
	ResultResponse noreceive(HttpServletRequest request, HttpServletResponse response) {
		ResultResponse result = new ResultResponse();
		// 1.接收数据
		Gson gson = new Gson();
		String order_goods_id = request.getParameter("record_id");
		// String order_goods = request.getParameter("order_goods");
		// PgtOrder pgt_order =gson.fromJson(order, PgtOrder.class);
		// List<PgtOrderGoods> szy_orderGoods =gson.fromJson(order_goods, new
		// TypeToken<List<PgtOrderGoods>>() {}.getType());
		//
		// 2.把消息放进队列
		// ERPObj message = null;
		// boolean rst = MQUtils.sendMessage(Constants.ERP_POINT, message);
		//
		// //3.从队列取消息
		// Callback callback = null;
		// MQUtils.receiveMessage("", Constants.ERP_POINT, callback);

		// 4.调用erp对数据持久化
		List<PgtOrderGoods> orderGoodslist_temp = orderService.queryOrderGoods(Integer.valueOf(order_goods_id));
		Integer order_id = orderGoodslist_temp.get(0).getOrder_id();
		List<PgtOrder> orderList = orderService.queryOrder(order_id);
		// List<PgtOrderGoods> orderGoodslist =
		// orderService.queryOrderGoods(Integer.valueOf(order_id));
		storeService.insertInBoundNotice(orderList.get(0), orderGoodslist_temp, order_goods_id);
		result.setCode(0);
		result.setMsg("ERP数据插入成功!");
		result.setData(null);
		return result;
	}

	/*
	 * funciton：退货
	 */
	@RequestMapping("/backGoods")
	ResultResponse backGoods(HttpServletRequest request, HttpServletResponse response) {
		ResultResponse result = new ResultResponse();
		// 1.接收数据
		Gson gson = new Gson();
		String order = request.getParameter("order");
		String order_goods = request.getParameter("order_goods");
		SzyOrder szy_order = gson.fromJson(order, SzyOrder.class);
		List<SzyOrderGoods> szy_orderGoods = gson.fromJson(order_goods, new TypeToken<List<SzyOrderGoods>>() {
		}.getType());
		//
		// 2.把消息放进队列
		// ERPObj message = null;
		// boolean rst = MQUtils.sendMessage(Constants.ERP_POINT, message);
		//
		// //3.从队列取消息
		// Callback callback = null;
		// MQUtils.receiveMessage("", Constants.ERP_POINT, callback);

		// 4.调用erp对数据持久化
		// storeService.insertInBoundNotice(szy_order,szy_orderGoods);
		result.setCode(0);
		result.setMsg("ERP数据插入成功!");
		result.setData(null);
		return result;
	}

	/*
	 * function：付款
	 */
	@RequestMapping("/payOrder")
	ResultResponse payOrder(HttpServletRequest request, HttpServletResponse response) {
		ResultResponse result = new ResultResponse();
		// 1.接收数据
		Gson gson = new Gson();
		String order = request.getParameter("order");
		String order_goods = request.getParameter("order_goods");
		PgtOrder pgt_order = gson.fromJson(order, PgtOrder.class);
 		List<PgtOrderGoods> pgt_orderGoods = gson.fromJson(order_goods, new TypeToken<List<PgtOrderGoods>>() {
		}.getType());

		// //2.把消息放进队列
		// ERPObj message = null;
		// boolean rst = MQUtils.sendMessage(Constants.ERP_POINT, message);
		//
		// //3.从队列取消息
		// Callback callback = null;
		// MQUtils.receiveMessage("", Constants.ERP_POINT, callback);

		// 4.调用erp对数据持久化
		storeService.insertOutBoundNotice(pgt_order, pgt_orderGoods);
		result.setCode(0);
		result.setMsg("ERP数据插入成功!");
		result.setData(null);
		return result;
	}

	/*
	 * function：取消订单
	 */
	@RequestMapping("/cancleOrder")
	ResultResponse cancleOrder(HttpServletRequest request, HttpServletResponse response) {
		ResultResponse result = new ResultResponse();
		// 1.接收数据
		String orderId = request.getParameter("order_id");

		// //2.把消息放进队列
		// ERPObj message = null;
		// boolean rst = MQUtils.sendMessage(Constants.ERP_POINT, message);
		//
		// //3.从队列取消息
		// Callback callback = null;
		// MQUtils.receiveMessage("", Constants.ERP_POINT, callback);
		List<PgtOrder> list = pgtOrderMapper.selectList(Integer.valueOf(orderId));
		String orderSn = null;
		if (list.size() <= 0) {
			orderSn = "9999";
		} else {
			orderSn = list.get(0).getOrder_sn();
		}
		PgtOutboundNotice selectByPurchaseCode = storeService.selectByPurchaseCode(orderSn);
		if (selectByPurchaseCode == null) {
			result.setCode(1);
			result.setMsg("参数有误，数据不存在!");
			return result;
		}
		Byte status = selectByPurchaseCode.getStatus();
		if (status.equals(1)) {
			result.setCode(1);
			result.setMsg("已取消!");
			return result;
		}
		if (status.equals(10)) {
			result.setCode(1);
			result.setMsg("已出库，不能取消!");
			return result;
		}
		// 4.调用erp对数据持久化
		try {
			int rst = storeService.cancelOrder(orderSn);
			if (rst > 0) {
				result.setCode(0);
				result.setMsg("ERP数据插入成功!");
			} else {
				result.setCode(1);
				result.setMsg("ERP数据插入失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("/cancleOrder", e);
			result.setCode(1);
			result.setMsg("ERP数据插入异常!");
		}
		return result;
	}

	/*
	 * function：确认收货
	 */
	@RequestMapping("/confirmDelivery")
	ResultResponse confirmDelivery(HttpServletRequest request, HttpServletResponse response) {
		ResultResponse result = new ResultResponse();
		// 1.接收数据
		/*
		 * String orderJson = request.getParameter("order"); String orderGoodsJson =
		 * request.getParameter("order_goods"); if(StringUtils.isEmpty(orderJson) ||
		 * StringUtils.isEmpty(orderGoodsJson)) { result.setCode(1);
		 * result.setMsg("参数有误!"); return result; }
		 */
		// Gson gson = new Gson();
		String orderId = request.getParameter("order_id");
		if (StringUtils.isEmpty(orderId)) {
			result.setCode(1);
			result.setMsg("参数有误!");
			return result;
		}
		//
		// //2.把消息放进队列
		// ERPObj message = null;
		// boolean rst = MQUtils.sendMessage(Constants.ERP_POINT, message);
		//
		// //3.从队列取消息
		// Callback callback = null;
		// MQUtils.receiveMessage("", Constants.ERP_POINT, callback);
		// 4.调用erp对数据持久化
		try {
			List<PgtOrder> orders = orderService.queryOrder(Integer.valueOf(orderId));// gson.fromJson(orderJson,
																						// SzyOrder.class);
			if (orders == null || orders.size() == 0) {
				result.setCode(1);
				result.setMsg("参数有误!");
				return result;
			}
			List<PgtOrderGoods> queryOrderGoods = orderService.queryOrderGoodsbyOrderId(Integer.valueOf(orderId));// gson.fromJson(orderGoodsJson,
																													// new
																													// TypeToken<List<SzyOrderGoods>>()
																													// {}.getType());
			if (queryOrderGoods == null || queryOrderGoods.size() == 0) {
				result.setCode(1);
				result.setMsg("参数有误!");
				return result;
			}
			int rst = storeService.confirmDelivery(orders.get(0), queryOrderGoods);
			if (rst > 0) {
				result.setCode(0);
				result.setMsg("ERP数据插入成功!");
				result.setData(null);
			} else {
				result.setCode(1);
				result.setMsg("ERP数据插入失败!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("/confirmDelivery", e);
			result.setCode(1);
			result.setMsg("ERP数据插入异常!");
		}
		return result;
	}

}
