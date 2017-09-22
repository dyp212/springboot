package com.test.spring.boot.dao.newDao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.test.spring.boot.entity.PgtInboundNoticeStockBatch;
import com.test.spring.boot.entity.PgtInboundNoticeStockBatchExample;

public interface PgtInboundNoticeStockBatchMapper {
    long countByExample(PgtInboundNoticeStockBatchExample example);

    int deleteByExample(PgtInboundNoticeStockBatchExample example);

    int deleteByPrimaryKey(Integer inboundNoticeStockBatchId);

    int insert(PgtInboundNoticeStockBatch record);

    int insertSelective(PgtInboundNoticeStockBatch record);

    List<PgtInboundNoticeStockBatch> selectByExample(PgtInboundNoticeStockBatchExample example);

    PgtInboundNoticeStockBatch selectByPrimaryKey(Integer inboundNoticeStockBatchId);

    int updateByExampleSelective(@Param("record") PgtInboundNoticeStockBatch record, @Param("example") PgtInboundNoticeStockBatchExample example);

    int updateByExample(@Param("record") PgtInboundNoticeStockBatch record, @Param("example") PgtInboundNoticeStockBatchExample example);

    int updateByPrimaryKeySelective(PgtInboundNoticeStockBatch record);

    int updateByPrimaryKey(PgtInboundNoticeStockBatch record);
}