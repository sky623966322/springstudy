package com.springstudy.module;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

    @Value("${study.testStr}")
    private String testStr;

    @Override
    public String sayHello() {
        return "hello!!" + testStr;
    }

}
