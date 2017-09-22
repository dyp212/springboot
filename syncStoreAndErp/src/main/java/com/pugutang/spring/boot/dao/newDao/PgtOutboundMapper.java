package com.pugutang.spring.boot.dao.newDao;

import com.pugutang.spring.boot.entity.PgtOutbound;
import com.pugutang.spring.boot.entity.PgtOutboundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgtOutboundMapper {
    long countByExample(PgtOutboundExample example);

    int deleteByExample(PgtOutboundExample example);

    int deleteByPrimaryKey(Long outBoundId);

    int insert(PgtOutbound record);

    int insertSelective(PgtOutbound record);

    List<PgtOutbound> selectByExample(PgtOutboundExample example);

    PgtOutbound selectByPrimaryKey(Long outBoundId);

    int updateByExampleSelective(@Param("record") PgtOutbound record, @Param("example") PgtOutboundExample example);

    int updateByExample(@Param("record") PgtOutbound record, @Param("example") PgtOutboundExample example);

    int updateByPrimaryKeySelective(PgtOutbound record);

    int updateByPrimaryKey(PgtOutbound record);
}