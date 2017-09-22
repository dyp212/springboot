package com.pugutang.spring.boot.dao.newDao;

import com.pugutang.spring.boot.entity.PgtOrder;
import com.pugutang.spring.boot.entity.PgtOrderExample;
import com.pugutang.spring.boot.entity.PgtOrderGoods;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgtOrderMapper {
    long countByExample(PgtOrderExample example);

    int deleteByExample(PgtOrderExample example);

    int deleteByPrimaryKey(Integer pgtOrderId);

    int insert(PgtOrder record);

    int insertSelective(PgtOrder record);

    List<PgtOrder> selectByExample(PgtOrderExample example);

    PgtOrder selectByPrimaryKey(Integer pgtOrderId);

    int updateByExampleSelective(@Param("record") PgtOrder record, @Param("example") PgtOrderExample example);

    int updateByExample(@Param("record") PgtOrder record, @Param("example") PgtOrderExample example);

    int updateByPrimaryKeySelective(PgtOrder record);

    int updateByPrimaryKey(PgtOrder record);
    
    List<PgtOrder> selectList(@Param("order_id") Integer order_id);
}