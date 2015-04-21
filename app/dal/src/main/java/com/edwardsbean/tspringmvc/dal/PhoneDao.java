package com.edwardsbean.tspringmvc.dal;


import com.edwardsbean.tspringmvc.dal.entity.Phone;

/**
 * Created by edwardsbean on 2015/4/20 0020.
 */
public interface PhoneDao {
    public void insert(Phone phone);

    public Phone getPhone(long id);
}
