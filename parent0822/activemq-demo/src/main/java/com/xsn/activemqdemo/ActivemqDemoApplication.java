package com.xsn.activemqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
    public class ActivemqDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqDemoApplication.class, args);
    }

}
