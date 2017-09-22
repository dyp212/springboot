package com.pugutang.spring.boot.dao.newDao;

import com.pugutang.spring.boot.entity.SerialConfig;
import com.pugutang.spring.boot.entity.SerialConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SerialConfigMapper {
    long countByExample(SerialConfigExample example);

    int deleteByExample(SerialConfigExample example);

    int deleteByPrimaryKey(Integer serialId);

    int insert(SerialConfig record);

    int insertSelective(SerialConfig record);

    List<SerialConfig> selectByExample(SerialConfigExample example);

    SerialConfig selectByPrimaryKey(Integer serialId);

    int updateByExampleSelective(@Param("record") SerialConfig record, @Param("example") SerialConfigExample example);

    int updateByExample(@Param("record") SerialConfig record, @Param("example") SerialConfigExample example);

    int updateByPrimaryKeySelective(SerialConfig record);

    int updateByPrimaryKey(SerialConfig record);
    
    int updateBySome(@Param("latest_no") Integer latest_no,@Param("type_code") String type_code);
    
    List<SerialConfig> selectList(@Param("type_code") String type_code);
}