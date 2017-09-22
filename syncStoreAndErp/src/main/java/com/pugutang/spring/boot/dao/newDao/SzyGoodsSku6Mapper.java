package com.pugutang.spring.boot.dao.newDao;

import com.pugutang.spring.boot.entity.SzyGoodsSku6;
import com.pugutang.spring.boot.entity.SzyGoodsSku6Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SzyGoodsSku6Mapper {
    long countByExample(SzyGoodsSku6Example example);

    int deleteByExample(SzyGoodsSku6Example example);

    int deleteByPrimaryKey(Integer skuId);

    int insert(SzyGoodsSku6 record);

    int insertSelective(SzyGoodsSku6 record);

    List<SzyGoodsSku6> selectByExample(SzyGoodsSku6Example example);

    SzyGoodsSku6 selectByPrimaryKey(Integer skuId);

    int updateByExampleSelective(@Param("record") SzyGoodsSku6 record, @Param("example") SzyGoodsSku6Example example);

    int updateByExample(@Param("record") SzyGoodsSku6 record, @Param("example") SzyGoodsSku6Example example);

    int updateByPrimaryKeySelective(SzyGoodsSku6 record);

    int updateByPrimaryKey(SzyGoodsSku6 record);
    
    List<SzyGoodsSku6> selectList(@Param("good_sn") String good_sn);
}