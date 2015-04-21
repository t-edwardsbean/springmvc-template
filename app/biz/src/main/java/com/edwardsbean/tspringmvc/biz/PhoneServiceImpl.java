package com.edwardsbean.tspringmvc.biz;

import com.edwardsbean.tspringmvc.dal.PhoneDao;
import com.edwardsbean.tspringmvc.dal.entity.Phone;
import com.edwardsbean.tspringmvc.dal.mapper.auto.PhoneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by edwardsbean on 2015/4/21.
 */
@Repository("phoneService")
public class PhoneServiceImpl implements PhoneService{

    @Autowired
    PhoneDao phoneDao;

    @Autowired
    PhoneMapper phoneMapper;

    @Override
    public Phone getPhone(long id) {
        return phoneDao.getPhone(id);
    }

    @Override
    public int insertPhone(Phone phone) {
        return phoneMapper.insert(phone);
    }


}
