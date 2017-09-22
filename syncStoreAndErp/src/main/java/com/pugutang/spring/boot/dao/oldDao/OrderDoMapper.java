package com.pugutang.spring.boot.dao.oldDao;

import com.pugutang.spring.boot.entity.OrderDo;
import com.pugutang.spring.boot.entity.OrderDoExample;
import com.pugutang.spring.boot.entity.OrderDoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDoMapper {
    long countByExample(OrderDoExample example);

    int deleteByPrimaryKey(Integer order_id);

    int insert(OrderDoWithBLOBs record);

    int insertSelective(OrderDoWithBLOBs record);

    List<OrderDoWithBLOBs> selectByExampleWithBLOBs(OrderDoExample example);

    List<OrderDo> selectByExample(OrderDoExample example);

    OrderDoWithBLOBs selectByPrimaryKey(Integer order_id);

    int updateByExampleSelective(@Param("record") OrderDoWithBLOBs record, @Param("example") OrderDoExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderDoWithBLOBs record, @Param("example") OrderDoExample example);

    int updateByExample(@Param("record") OrderDo record, @Param("example") OrderDoExample example);

    int updateByPrimaryKeySelective(OrderDoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrderDoWithBLOBs record);

    int updateByPrimaryKey(OrderDo record);
}