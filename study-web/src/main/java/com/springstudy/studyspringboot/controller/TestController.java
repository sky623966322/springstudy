package com.springstudy.studyspringboot.controller;

import com.springstudy.module.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    String home(){
        return helloService.sayHello();
    }

}
