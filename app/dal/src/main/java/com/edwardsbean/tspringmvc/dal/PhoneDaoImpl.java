package com.edwardsbean.tspringmvc.dal;

import com.edwardsbean.tspringmvc.dal.entity.Phone;
import com.edwardsbean.tspringmvc.dal.mapper.auto.PhoneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by edwardsbean on 2015/4/20 0020.
 */
@Repository("phoneDao")
public class PhoneDaoImpl implements PhoneDao {
    @Autowired
    PhoneMapper phoneMapper;

    @Override
    public void insert(Phone phone) {
        phoneMapper.insert(phone);
    }

    @Override
    public Phone getPhone(long id) {
        return phoneMapper.selectByPrimaryKey(id);
    }
}
