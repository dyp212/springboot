package com.test.spring.boot.dao.newDao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.test.spring.boot.entity.PgtStoreShop;
import com.test.spring.boot.entity.SzyStore;
import com.test.spring.boot.entity.SzyStoreExample;

public interface SzyStoreMapper {
    long countByExample(SzyStoreExample example);

    int deleteByExample(SzyStoreExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(SzyStore record);

    int insertSelective(SzyStore record);

    List<SzyStore> selectByExampleWithBLOBs(SzyStoreExample example);

    List<SzyStore> selectByExample(SzyStoreExample example);

    SzyStore selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") SzyStore record, @Param("example") SzyStoreExample example);

    int updateByExampleWithBLOBs(@Param("record") SzyStore record, @Param("example") SzyStoreExample example);

    int updateByExample(@Param("record") SzyStore record, @Param("example") SzyStoreExample example);

    int updateByPrimaryKeySelective(SzyStore record);

    int updateByPrimaryKeyWithBLOBs(SzyStore record);

    int updateByPrimaryKey(SzyStore record);
    
    List<SzyStore> selectList(@Param("store_id") String store_id);

}