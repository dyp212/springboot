package com.test.spring.boot.dao.newDao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.test.spring.boot.entity.PgtOutboundDetail;
import com.test.spring.boot.entity.PgtOutboundDetailExample;

public interface PgtOutboundDetailMapper {
    long countByExample(PgtOutboundDetailExample example);

    int deleteByExample(PgtOutboundDetailExample example);

    int deleteByPrimaryKey(Long outboundDetailId);

    int insert(PgtOutboundDetail record);

    int insertSelective(PgtOutboundDetail record);

    List<PgtOutboundDetail> selectByExample(PgtOutboundDetailExample example);

    PgtOutboundDetail selectByPrimaryKey(Long outboundDetailId);

    int updateByExampleSelective(@Param("record") PgtOutboundDetail record, @Param("example") PgtOutboundDetailExample example);

    int updateByExample(@Param("record") PgtOutboundDetail record, @Param("example") PgtOutboundDetailExample example);

    int updateByPrimaryKeySelective(PgtOutboundDetail record);

    int updateByPrimaryKey(PgtOutboundDetail record);
}