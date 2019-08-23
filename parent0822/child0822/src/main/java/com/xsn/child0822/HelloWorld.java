package com.xsn.child0822;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.apache.log4j.Logger;
@RestController
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
