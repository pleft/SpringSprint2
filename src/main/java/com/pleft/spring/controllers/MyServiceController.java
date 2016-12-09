package com.pleft.spring.controllers;

import com.pleft.spring.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class MyServiceController {

    @Autowired
    MyService myService;

    @RequestMapping( method = GET, value = "/")
    @ResponseBody
    public String printHello() {
        return myService.sayHello();
    }
}
