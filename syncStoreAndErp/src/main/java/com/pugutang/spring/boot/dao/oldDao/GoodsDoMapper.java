package com.pugutang.spring.boot.dao.oldDao;

import com.pugutang.spring.boot.entity.GoodsDo;
import com.pugutang.spring.boot.entity.GoodsDoExample;
import com.pugutang.spring.boot.entity.GoodsDoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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