package com.xsn.springdemp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication

public class SpringDempApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringDempApplication.class, args);
    }

}
