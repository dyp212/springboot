package com.pugutang.spring.boot.dao.newDao;

import com.pugutang.spring.boot.entity.PgtInboundNoticeDetails;
import com.pugutang.spring.boot.entity.PgtInboundNoticeDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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