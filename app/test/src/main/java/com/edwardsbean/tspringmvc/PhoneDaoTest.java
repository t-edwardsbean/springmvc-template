package com.edwardsbean.tspringmvc;

import com.edwardsbean.tspringmvc.dal.PhoneDao;
import com.edwardsbean.tspringmvc.dal.entity.Phone;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:META-INF/spring/tspringmvc-base.xml","classpath*:META-INF/spring/tspringmvc-dal-db.xml","classpath*:META-INF/spring/tspringmvc-dal.xml"})
public class PhoneDaoTest {
    @Autowired
    PhoneDao phoneDao;

    @Test
    public void testInsert() throws Exception {
        Phone phone = new Phone();
        phone.setContent("this is a content");
        phoneDao.insert(phone);
    }
}