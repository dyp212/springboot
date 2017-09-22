package com.pugutang.spring.boot.dao.newDao;

import com.pugutang.spring.boot.entity.PgtOrderGoods;
import com.pugutang.spring.boot.entity.PgtStoreShop;
import com.pugutang.spring.boot.entity.PgtStoreShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgtStoreShopMapper {
    long countByExample(PgtStoreShopExample example);

    int deleteByExample(PgtStoreShopExample example);

    int deleteByPrimaryKey(Integer storeShopId);

    int insert(PgtStoreShop record);

    int insertSelective(PgtStoreShop record);

    List<PgtStoreShop> selectByExample(PgtStoreShopExample example);

    PgtStoreShop selectByPrimaryKey(Integer storeShopId);

    int updateByExampleSelective(@Param("record") PgtStoreShop record, @Param("example") PgtStoreShopExample example);

    int updateByExample(@Param("record") PgtStoreShop record, @Param("example") PgtStoreShopExample example);

    int updateByPrimaryKeySelective(PgtStoreShop record);

    int updateByPrimaryKey(PgtStoreShop record);
    
    List<PgtStoreShop> selectList(@Param("shop_id") Integer shop_id);
}