package com.test.spring.boot.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.spring.boot.dao.oldDao.GoodsDoMapper;
import com.test.spring.boot.dao.oldDao.GoodsSkuDoMapper;
import com.test.spring.boot.entity.GoodsDo;
import com.test.spring.boot.entity.GoodsDoExample;
import com.test.spring.boot.entity.GoodsDoWithBLOBs;
import com.test.spring.boot.entity.GoodsSkuDo;
import com.test.spring.boot.entity.GoodsSkuDoExample;
import com.test.spring.boot.entity.GoodsSkuDoWithBLOBs;
@Service
public class GoodsService {
	@Autowired
	private GoodsDoMapper goodsDoMapper;
	@Autowired
	private GoodsSkuDoMapper goodsSkuDoMapper;
	public void insertGoods(GoodsDoWithBLOBs goodsDo, GoodsSkuDoWithBLOBs goodsSku) {
		GoodsDoExample example = new GoodsDoExample();
		
		example.createCriteria().andGoods_id_from_erpEqualTo(goodsDo.getGoods_id_from_erp());
		List<GoodsDo> list = goodsDoMapper.selectByExample(example);

		
		GoodsSkuDoExample skuexample=new GoodsSkuDoExample();
		skuexample.createCriteria().andGoods_id_from_erpEqualTo(goodsDo.getGoods_id_from_erp());
		
		List<GoodsSkuDo> listSku = goodsSkuDoMapper.selectByExample(skuexample);
		
		if (list.size() > 0) {
			GoodsDo goodsTemp=list.get(0);
			goodsTemp.setGoods_name(goodsDo.getGoods_name());
			goodsTemp.setGoods_barcode(goodsDo.getGoods_barcode());
			goodsTemp.setGoods_sn(goodsDo.getGoods_sn());
			goodsDoMapper.updateByPrimaryKey(goodsTemp);
			
			GoodsSkuDo  skuTemp=listSku.get(0);
			skuTemp.setSku_name(goodsSku.getSku_name());
			skuTemp.setGoods_sn(goodsSku.getGoods_sn());
			skuTemp.setGoods_barcode(goodsSku.getGoods_barcode());
			goodsSkuDoMapper.updateByPrimaryKey(skuTemp);
			
		} else {
			goodsDoMapper.insert(goodsDo);
			goodsSku.setGoods_id(goodsDo.getGoods_id());
			goodsSkuDoMapper.insert(goodsSku);
			goodsDoMapper.updateSkuIdByPrimaryKey(goodsDo.getGoods_id(), goodsSku.getSku_id());
		}
	}
	public void refesehGoods(Map<String, Object> pdShop) {
		
		/*pdShop.put("goods_id", pdGoods.get("goods_id"));
		pdShop.put("goods_name", pdGoods.get("goods_name"));
		pdShop.put("cat_id", pdGoods.get("cat_id"));
		//pdShop.put("sku_id", pdGoods.get("sku_id"));
		pdShop.put("goods_barcode", pdGoods.get("goods_barcode"));
		pdShop.put("brand_id", pdGoods.get("brand_id"));*/
		/*
		 * `sku_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'SKU编号
`sku_name` varchar(100) NOT NULL DEFAULT '' COMMENT 'SKU商品名称',
`goods_id` int(11) NOT NULL DEFAULT '0' COMMENT '商品ID',
`spec_ids` varchar(255) NOT NULL DEFAULT '' COMMENT '商品规格id串',
`spec_vids` varchar(255) NOT NULL DEFAULT '' COMMENT '商品规格值id串',
`sku_encode` varchar(60) NOT NULL DEFAULT '' COMMENT '商品编码'
`sku_barcode` varchar(20) NOT NULL DEFAULT '' COMMENT '商品条形码'
		 */
	/*	pdShop.put("sku_id", pdGoodsSku.get("sku_id"));
		pdShop.put("sku_name", pdGoodsSku.get("sku_name"));
		pdShop.put("spec_ids", pdGoodsSku.get("spec_ids"));
		pdShop.put("spec_vids", pdGoodsSku.get("spec_vids"));
		pdShop.put("sku_encode", pdGoodsSku.get("sku_encode"));
		pdShop.put("sku_barcode", pdGoodsSku.get("sku_barcode"));*/
		GoodsDoWithBLOBs goodsDo=new GoodsDoWithBLOBs();
		
		goodsDo.setGoods_id_from_erp(MapUtils.retrieveIntValue(pdShop,"goods_id"));
		goodsDo.setGoods_name(MapUtils.retrieveStringValue(pdShop,"goods_name"));
		goodsDo.setCat_id(0);
		goodsDo.setSku_id_from_erp(MapUtils.retrieveIntValue(pdShop,"sku_id"));
		goodsDo.setGoods_barcode(MapUtils.retrieveStringValue(pdShop,"goods_barcode"));
		goodsDo.setGoods_sn(MapUtils.retrieveStringValue(pdShop,"sku_encode"));
		
		
		goodsDo.setBrand_id(0);
		
		goodsDo.setShop_id(0);
		goodsDo.setSku_open(false);
		goodsDo.setSku_id(0);
		
		goodsDo.setGoods_price(new BigDecimal(0));
		goodsDo.setGoods_number(0);
		goodsDo.setWarn_number(0);
		goodsDo.setGoods_image("");
		goodsDo.setClick_count(0);
		goodsDo.setComment_num(0);
		goodsDo.setSale_num(0);
		goodsDo.setGoods_audit(false);
		goodsDo.setGoods_status(false);
		goodsDo.setIs_delete(false);
		
		goodsDo.setIs_best(false);
		goodsDo.setIs_new(false);
		goodsDo.setIs_hot(false);
		goodsDo.setIs_promote(false);
		goodsDo.setGoods_sort(0);
		Long time=System.currentTimeMillis()/1000;
		goodsDo.setAdd_time(time.intValue());
		goodsDo.setLast_time(time.intValue());
		 /* 		  
		  * 

		  `goods_sort` int(4) NOT NULL DEFAULT '255' COMMENT '商品推荐排序',
		  `add_time` int(11) NOT NULL COMMENT '商品发布时间',
		  `last_time` int(11) NOT NULL COMMENT '最后一次更新时间',
		  `act_id` int(11) DEFAULT '0' COMMENT '活动编号',
		  `lib_cat_id` int(11) DEFAULT '0' COMMENT '商品库商品分类',
		  `other_attrs` text COMMENT '商品的扩展属性',
		  `goods_id_from_erp` int(11) DEFAULT NULL COMMENT '物料id来自erp',
		  `sku_id_from_erp` int(11) DEFAULT NULL COMMENT 'skuid来自erp',*/
		
		GoodsSkuDoWithBLOBs goodsSku=new GoodsSkuDoWithBLOBs();
		goodsSku.setGoods_id_from_erp(MapUtils.retrieveIntValue(pdShop,"goods_id"));
		goodsSku.setSku_id_from_erp(MapUtils.retrieveIntValue(pdShop,"sku_id"));
		goodsSku.setSku_name(MapUtils.retrieveStringValue(pdShop,"goods_name"));
		goodsSku.setSpec_ids(MapUtils.retrieveStringValue(pdShop,"spec_ids"));
		goodsSku.setSpec_vids(MapUtils.retrieveStringValue(pdShop,"spec_vids"));
		goodsSku.setGoods_sn(MapUtils.retrieveStringValue(pdShop,"sku_encode"));
		goodsSku.setGoods_barcode(MapUtils.retrieveStringValue(pdShop,"sku_barcode"));
		
		goodsSku.setSku_image("");
		goodsSku.setGoods_price(new BigDecimal(0) );
		goodsSku.setGoods_number(0);
		goodsSku.setIs_spu(false);
		goodsSku.setIs_enable(true);
		/*
		  
		  `is_spu` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否为SPU商品',
		  `is_enable` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否有效',
		  `goods_id_from_erp` int(11) DEFAULT NULL COMMENT '物料id来自erp',
		  `sku_id_from_erp` int(11) DEFAULT NULL COMMENT 'skuid来自erp',*/
		
		this.insertGoods(goodsDo, goodsSku);
	}
	
}
