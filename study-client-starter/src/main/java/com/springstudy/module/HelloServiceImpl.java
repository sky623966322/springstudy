package com.springstudy.module;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello";
    }
}
