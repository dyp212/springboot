package com.test.spring.boot.dao.oldDao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.test.spring.boot.entity.GoodsSkuDo;
import com.test.spring.boot.entity.GoodsSkuDoExample;
import com.test.spring.boot.entity.GoodsSkuDoWithBLOBs;

public interface GoodsSkuDoMapper {
    long countByExample(GoodsSkuDoExample example);

    int deleteByPrimaryKey(Integer sku_id);

    int insert(GoodsSkuDoWithBLOBs record);

    int insertSelective(GoodsSkuDoWithBLOBs record);

    List<GoodsSkuDoWithBLOBs> selectByExampleWithBLOBs(GoodsSkuDoExample example);

    List<GoodsSkuDo> selectByExample(GoodsSkuDoExample example);

    GoodsSkuDoWithBLOBs selectByPrimaryKey(Integer sku_id);

    int updateByExampleSelective(@Param("record") GoodsSkuDoWithBLOBs record, @Param("example") GoodsSkuDoExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsSkuDoWithBLOBs record, @Param("example") GoodsSkuDoExample example);

    int updateByExample(@Param("record") GoodsSkuDo record, @Param("example") GoodsSkuDoExample example);

    int updateByPrimaryKeySelective(GoodsSkuDoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodsSkuDoWithBLOBs record);

    int updateByPrimaryKey(GoodsSkuDo record);
}