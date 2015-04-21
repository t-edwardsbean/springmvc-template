package com.edwardsbean.tspringmvc.biz;

import com.edwardsbean.tspringmvc.dal.PhoneDao;
import com.edwardsbean.tspringmvc.dal.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by shicongyu01_91 on 2015/4/21.
 */
@Repository("phoneService")
public class PhoneServiceImpl implements PhoneService{
    @Autowired
    PhoneDao phoneDao;

    @Override
    public Phone getPhone(long id) {
        return phoneDao.getPhone(id);
    }
}
