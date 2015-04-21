package com.edwardsbean.tspringmvc;


import com.edwardsbean.timo.service.model.Msg;
import com.edwardsbean.tspringmvc.biz.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {
    @Autowired
    PhoneService phoneService;

    @RequestMapping(value = "/phone/{id}", method = RequestMethod.GET)
    public Msg get(@PathVariable long id) {
        Msg msg = new Msg();
        msg.setReturnData(phoneService.getPhone(id));
        return msg;
    }
}