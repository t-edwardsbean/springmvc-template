package com.edwardsbean.tspringmvc;


import com.edwardsbean.timo.service.model.Msg;
import com.edwardsbean.tspringmvc.biz.PhoneService;
import com.edwardsbean.tspringmvc.dal.entity.Phone;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class PhoneController extends BaseController {
    @Autowired
    PhoneService phoneService;

    @ApiOperation(value = "查看手机日志", httpMethod = "GET", response = Msg.class)
    @RequestMapping(value = "/phones/{id}", method = RequestMethod.GET)
    public Msg get(@ApiParam(required = true, value = "手机日志id") @PathVariable long id) {
        Msg msg = new Msg();
        msg.setReturnData(phoneService.getPhone(id));
        return msg;
    }

    @ApiOperation(value = "上传手机日志", httpMethod = "POST", response = Msg.class)
    @RequestMapping(value = "/phones", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public Msg post(@ApiParam(required = true,name = "content", value = "手机日志内容") @RequestParam String content) {
        Phone phone = new Phone();
        phone.setContent(content);
        int id = phoneService.insertPhone(phone);
        Msg msg = new Msg();
        msg.setReturnData(id);
        return msg;
    }
}