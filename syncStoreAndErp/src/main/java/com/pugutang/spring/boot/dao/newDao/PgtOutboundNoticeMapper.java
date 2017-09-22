package com.pugutang.spring.boot.dao.newDao;

import com.pugutang.spring.boot.entity.PgtOutboundNotice;
import com.pugutang.spring.boot.entity.PgtOutboundNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgtOutboundNoticeMapper {
    long countByExample(PgtOutboundNoticeExample example);

    int deleteByExample(PgtOutboundNoticeExample example);

    int deleteByPrimaryKey(Long outboundNoticeId);

    int insert(PgtOutboundNotice record);

    int insertSelective(PgtOutboundNotice record);

    List<PgtOutboundNotice> selectByExample(PgtOutboundNoticeExample example);

    PgtOutboundNotice selectByPrimaryKey(Long outboundNoticeId);

    int updateByExampleSelective(@Param("record") PgtOutboundNotice record, @Param("example") PgtOutboundNoticeExample example);

    int updateByExample(@Param("record") PgtOutboundNotice record, @Param("example") PgtOutboundNoticeExample example);

    int updateByPrimaryKeySelective(PgtOutboundNotice record);

    int updateByPrimaryKey(PgtOutboundNotice record);
    
	int updateStatus(PgtOutboundNotice outboundNotice);

	PgtOutboundNotice selectByPurchaseCode(@Param("purchaseCode")String purchaseCode);
}