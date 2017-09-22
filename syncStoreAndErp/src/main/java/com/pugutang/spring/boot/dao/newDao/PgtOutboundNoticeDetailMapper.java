package com.pugutang.spring.boot.dao.newDao;

import com.pugutang.spring.boot.entity.PgtOutboundNoticeDetail;
import com.pugutang.spring.boot.entity.PgtOutboundNoticeDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgtOutboundNoticeDetailMapper {
    long countByExample(PgtOutboundNoticeDetailExample example);

    int deleteByExample(PgtOutboundNoticeDetailExample example);

    int deleteByPrimaryKey(Long outboundNoticeDetailId);

    int insert(PgtOutboundNoticeDetail record);

    int insertSelective(PgtOutboundNoticeDetail record);

    List<PgtOutboundNoticeDetail> selectByExample(PgtOutboundNoticeDetailExample example);

    PgtOutboundNoticeDetail selectByPrimaryKey(Long outboundNoticeDetailId);

    int updateByExampleSelective(@Param("record") PgtOutboundNoticeDetail record, @Param("example") PgtOutboundNoticeDetailExample example);

    int updateByExample(@Param("record") PgtOutboundNoticeDetail record, @Param("example") PgtOutboundNoticeDetailExample example);

    int updateByPrimaryKeySelective(PgtOutboundNoticeDetail record);

    int updateByPrimaryKey(PgtOutboundNoticeDetail record);

	List<PgtOutboundNoticeDetail> findByPurchaseCode( @Param("purchaseCode")String purchaseCode);
}