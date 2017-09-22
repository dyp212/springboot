package com.test.spring.boot.dao.newDao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.test.spring.boot.entity.PgtInboundNotice;
import com.test.spring.boot.entity.PgtInboundNoticeExample;

public interface PgtInboundNoticeMapper {
    long countByExample(PgtInboundNoticeExample example);

    int deleteByExample(PgtInboundNoticeExample example);

    int deleteByPrimaryKey(Long inboundNoticeId);

    int insert(PgtInboundNotice record);

    int insertSelective(PgtInboundNotice record);

    List<PgtInboundNotice> selectByExample(PgtInboundNoticeExample example);

    PgtInboundNotice selectByPrimaryKey(Long inboundNoticeId);

    int updateByExampleSelective(@Param("record") PgtInboundNotice record, @Param("example") PgtInboundNoticeExample example);

    int updateByExample(@Param("record") PgtInboundNotice record, @Param("example") PgtInboundNoticeExample example);

    int updateByPrimaryKeySelective(PgtInboundNotice record);

    int updateByPrimaryKey(PgtInboundNotice record);
}