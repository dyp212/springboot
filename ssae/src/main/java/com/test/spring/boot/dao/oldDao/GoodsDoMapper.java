package com.test.spring.boot.dao.oldDao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.test.spring.boot.entity.GoodsDo;
import com.test.spring.boot.entity.GoodsDoExample;
import com.test.spring.boot.entity.GoodsDoWithBLOBs;

public interface GoodsDoMapper {
    long countByExample(GoodsDoExample example);

    int deleteByPrimaryKey(Integer goods_id);

    int insert(GoodsDoWithBLOBs record);

    int insertSelective(GoodsDoWithBLOBs record);

    List<GoodsDoWithBLOBs> selectByExampleWithBLOBs(GoodsDoExample example);

    List<GoodsDo> selectByExample(GoodsDoExample example);

    GoodsDoWithBLOBs selectByPrimaryKey(Integer goods_id);

    int updateByExampleSelective(@Param("record") GoodsDoWithBLOBs record, @Param("example") GoodsDoExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsDoWithBLOBs record, @Param("example") GoodsDoExample example);

    int updateByExample(@Param("record") GoodsDo record, @Param("example") GoodsDoExample example);

    int updateByPrimaryKeySelective(GoodsDoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodsDoWithBLOBs record);

    int updateByPrimaryKey(GoodsDo record);
    
    int updateSkuIdByPrimaryKey(@Param("goods_id") Integer goods_id,@Param("sku_id") Integer sku_id);
}