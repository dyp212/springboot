package com.pugutang.spring.boot.dao.newDao;

import com.pugutang.spring.boot.entity.PgtInboundNoticeStockBatch;
import com.pugutang.spring.boot.entity.PgtInboundNoticeStockBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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