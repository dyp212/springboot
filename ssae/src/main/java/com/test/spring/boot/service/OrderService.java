package com.test.spring.boot.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.spring.boot.dao.newDao.PgtOrderGoodsMapper;
import com.test.spring.boot.dao.newDao.PgtOrderMapper;
import com.test.spring.boot.entity.PgtOrder;
import com.test.spring.boot.entity.PgtOrderExample;
import com.test.spring.boot.entity.PgtOrderGoods;
import com.test.spring.boot.entity.PgtOrderGoodsExample;


@Service
public class OrderService {
	private final static Logger logger = Logger.getLogger(OrderService.class);	
	
	@Autowired
	private PgtOrderMapper pgtOrderMapper;
	
	@Autowired
	private PgtOrderGoodsMapper pgtOrderGoodsMapper;
	
	
	public List<PgtOrder> queryOrder(Integer orderId) {
//		PgtOrderExample example = new PgtOrderExample();
//		PgtOrderExample.Criteria critia = example.createCriteria();
//		critia.andOrderIdEqualTo(orderId);
		List<PgtOrder> list =  pgtOrderMapper.selectList(orderId);
		return list;
	}
	
	public List<PgtOrderGoods> queryOrderGoods(Integer record_id) {
//		PgtOrderGoodsExample example = new PgtOrderGoodsExample();
//		PgtOrderGoodsExample.Criteria critia = example.createCriteria();
//		critia.andOrderIdEqualTo(orderId);
		List<PgtOrderGoods> list =  pgtOrderGoodsMapper.selectList(record_id);
		return list;
	}
	
	public List<PgtOrderGoods> queryOrderGoodsbyOrderId(Integer order_id) {
//		PgtOrderGoodsExample example = new PgtOrderGoodsExample();
//		PgtOrderGoodsExample.Criteria critia = example.createCriteria();
//		critia.andOrderIdEqualTo(orderId);
		List<PgtOrderGoods> list =  pgtOrderGoodsMapper.selectListbyOrderId(order_id);
		return list;
	}
	
	public List<PgtOrderGoods> queryOrderGood(Integer order_goods_id) {
//		PgtOrderGoodsExample example = new PgtOrderGoodsExample();
//		PgtOrderGoodsExample.Criteria critia = example.createCriteria();
//		critia.andOrderIdEqualTo(order_goods_id);
		List<PgtOrderGoods> list =  pgtOrderGoodsMapper.selectList(order_goods_id);
		return list;
	}	
}

