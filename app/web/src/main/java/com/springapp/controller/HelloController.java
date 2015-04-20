package com.springapp.controller;

import com.springapp.model.Msg;
import com.springapp.model.User;
//import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    //eg: localhost:8080/hello/ed?message=hello
    //    @ApiOperation(value = "hello测试", httpMethod = "GET", response = String.class, notes = "hello test")
    @RequestMapping(value="/hello/{username}",method= RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
    public Msg printWelcome(@PathVariable String username,@RequestParam String message) {
        Msg msg = new Msg();
        msg.setReturnData(new User(username,message));
        return msg;
    }

}