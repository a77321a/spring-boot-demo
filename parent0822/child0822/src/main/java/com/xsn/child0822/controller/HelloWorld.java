package com.xsn.child0822.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;

//import org.apache.log4j.Logger;
@RestController
public class HelloWorld {

//    定义消息转换器
//    spring-boot 默认配置了消息转换器


    @RequestMapping("/hello")
    public String hello() {
        return "Hello,你好";
    }
}
