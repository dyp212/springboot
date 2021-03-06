package com.test.spring.boot.dao.newDao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.test.spring.boot.entity.PgtOrder;
import com.test.spring.boot.entity.PgtOrderGoods;
import com.test.spring.boot.entity.PgtOrderGoodsExample;

public interface PgtOrderGoodsMapper {
    long countByExample(PgtOrderGoodsExample example);

    int deleteByExample(PgtOrderGoodsExample example);

    int deleteByPrimaryKey(Integer pgtOrderGoodsId);

    int insert(PgtOrderGoods record);

    int insertSelective(PgtOrderGoods record);

    List<PgtOrderGoods> selectByExample(PgtOrderGoodsExample example);

    PgtOrderGoods selectByPrimaryKey(Integer pgtOrderGoodsId);

    int updateByExampleSelective(@Param("record") PgtOrderGoods record, @Param("example") PgtOrderGoodsExample example);

    int updateByExample(@Param("record") PgtOrderGoods record, @Param("example") PgtOrderGoodsExample example);

    int updateByPrimaryKeySelective(PgtOrderGoods record);

    int updateByPrimaryKey(PgtOrderGoods record);
    
    List<PgtOrderGoods> selectList(@Param("order_goods_id") Integer order_goods_id);
    
    List<PgtOrderGoods> selectListbyOrderId(@Param("order_id") Integer order_id);
    
}