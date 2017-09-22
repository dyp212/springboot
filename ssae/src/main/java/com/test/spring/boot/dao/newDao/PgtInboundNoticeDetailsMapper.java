package com.test.spring.boot.dao.newDao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.test.spring.boot.entity.PgtInboundNoticeDetails;
import com.test.spring.boot.entity.PgtInboundNoticeDetailsExample;

public interface PgtInboundNoticeDetailsMapper {
    long countByExample(PgtInboundNoticeDetailsExample example);

    int deleteByExample(PgtInboundNoticeDetailsExample example);

    int deleteByPrimaryKey(Long noticeDetailId);

    int insert(PgtInboundNoticeDetails record);

    int insertSelective(PgtInboundNoticeDetails record);

    List<PgtInboundNoticeDetails> selectByExample(PgtInboundNoticeDetailsExample example);

    PgtInboundNoticeDetails selectByPrimaryKey(Long noticeDetailId);

    int updateByExampleSelective(@Param("record") PgtInboundNoticeDetails record, @Param("example") PgtInboundNoticeDetailsExample example);

    int updateByExample(@Param("record") PgtInboundNoticeDetails record, @Param("example") PgtInboundNoticeDetailsExample example);

    int updateByPrimaryKeySelective(PgtInboundNoticeDetails record);

    int updateByPrimaryKey(PgtInboundNoticeDetails record);
}