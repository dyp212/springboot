package com.pugutang.spring.boot.dao.newDao;

import com.pugutang.spring.boot.entity.SzyStockGoods6;
import com.pugutang.spring.boot.entity.SzyStockGoods6Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SzyStockGoods6Mapper {
    long countByExample(SzyStockGoods6Example example);

    int deleteByExample(SzyStockGoods6Example example);

    int deleteByPrimaryKey(Integer stockId);

    int insert(SzyStockGoods6 record);

    int insertSelective(SzyStockGoods6 record);

    List<SzyStockGoods6> selectByExampleWithBLOBs(SzyStockGoods6Example example);

    List<SzyStockGoods6> selectByExample(SzyStockGoods6Example example);

    SzyStockGoods6 selectByPrimaryKey(Integer stockId);

    int updateByExampleSelective(@Param("record") SzyStockGoods6 record, @Param("example") SzyStockGoods6Example example);

    int updateByExampleWithBLOBs(@Param("record") SzyStockGoods6 record, @Param("example") SzyStockGoods6Example example);

    int updateByExample(@Param("record") SzyStockGoods6 record, @Param("example") SzyStockGoods6Example example);

    int updateByPrimaryKeySelective(SzyStockGoods6 record);

    int updateByPrimaryKeyWithBLOBs(SzyStockGoods6 record);

    int updateByPrimaryKey(SzyStockGoods6 record);
    
    int updateStoreNum(SzyStockGoods6 record);

    Integer storeIdByPurchaseCode(@Param("purchaseCode")String purchaseCode);
}