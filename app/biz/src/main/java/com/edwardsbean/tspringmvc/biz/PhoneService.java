package com.edwardsbean.tspringmvc.biz;


import com.edwardsbean.tspringmvc.dal.entity.Phone;

/**
 * Created by edwardsbean on 2015/4/21.
 */
public interface PhoneService {
    public Phone getPhone(long id);

    public int insertPhone(Phone phone);
}
