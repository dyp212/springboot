package com.test.spring.boot.dao.newDao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.test.spring.boot.entity.PgtOrderStockBatch;
import com.test.spring.boot.entity.PgtOrderStockBatchExample;
import com.test.spring.boot.entity.SzyGoodsSku6;

public interface PgtOrderStockBatchMapper {
    long countByExample(PgtOrderStockBatchExample example);

    int deleteByExample(PgtOrderStockBatchExample example);

    int deleteByPrimaryKey(Integer orderStockBatchId);

    int insert(PgtOrderStockBatch record);

    int insertSelective(PgtOrderStockBatch record);

    List<PgtOrderStockBatch> selectByExample(PgtOrderStockBatchExample example);

    PgtOrderStockBatch selectByPrimaryKey(Integer orderStockBatchId);

    int updateByExampleSelective(@Param("record") PgtOrderStockBatch record, @Param("example") PgtOrderStockBatchExample example);

    int updateByExample(@Param("record") PgtOrderStockBatch record, @Param("example") PgtOrderStockBatchExample example);

    int updateByPrimaryKeySelective(PgtOrderStockBatch record);

    int updateByPrimaryKey(PgtOrderStockBatch record);
    
    List<PgtOrderStockBatch> selectList(@Param("record_id") Integer record_id);
}