package com.test.spring.boot.dao.newDao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.test.spring.boot.entity.PgtOrder;
import com.test.spring.boot.entity.PgtOrderExample;
import com.test.spring.boot.entity.PgtOrderGoods;

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