package com.edwardsbean.tspringmvc.dal.mapper.auto;

import com.edwardsbean.tspringmvc.dal.entity.Phone;
import com.edwardsbean.tspringmvc.dal.entity.PhoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneMapper {
    int countByExample(PhoneExample example);

    int deleteByExample(PhoneExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Phone record);

    int insertSelective(Phone record);

    List<Phone> selectByExample(PhoneExample example);

    Phone selectByPrimaryKey(Long id);

    List<Phone> selectByExampleWithPaging(PhoneExample example);

    int updateByExampleSelective(@Param("record") Phone record, @Param("example") PhoneExample example);

    int updateByExample(@Param("record") Phone record, @Param("example") PhoneExample example);

    int updateByPrimaryKeySelective(Phone record);

    int updateByPrimaryKey(Phone record);
}