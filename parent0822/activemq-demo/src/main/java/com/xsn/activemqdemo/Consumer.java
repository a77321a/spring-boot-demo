package com.xsn.activemqdemo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "topic")
    public void receiveMsg(String msg){
        System.out.println(msg+"........");
    }
}
