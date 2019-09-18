package com.xsn.activemqdemo.controller;

import com.xsn.activemqdemo.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import javax.jms.Destination;

@Controller
public class SendMQ {
    @Autowired
    private Producer producer;
    @RequestMapping("/activemq")
    @ResponseBody
    public String send(){
//        点对点
        Destination des = new ActiveMQQueue("topic");

        for(int i=1;i<=3;i++){
            producer.sendMessage(des,"hello"+i);
        }
        return "ok";
    }
}
