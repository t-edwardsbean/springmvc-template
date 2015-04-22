package com.edwardsbean.tspringmvc;

import com.edwardsbean.tspringmvc.dal.PhoneDao;
import com.edwardsbean.tspringmvc.dal.entity.Phone;
import com.edwardsbean.tspringmvc.dal.mapper.auto.PhoneMapper;
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

    @Autowired
    PhoneMapper mapper;

    @Test
    public void testInsert() throws Exception {
        Phone phone = new Phone();
        phone.setContent("this is a content");
        phoneDao.insert(phone);
    }

    @Test
    public void testMapperInsert() throws Exception {
        Phone phone = new Phone();
        phone.setContent("this i2s a content");
        mapper.insert(phone);
    }

    @Test
    public void testMapperSelect() throws Exception {
        System.out.println(mapper.selectByPrimaryKey(1L));
    }
}