package com.xsn.activemqdemo;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;

import javax.annotation.Resource;
import javax.jms.Destination;

public class Producer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMessage(String destination,String message){

        Destination des = new ActiveMQQueue("destination");
        jmsMessagingTemplate.convertAndSend(destination,message);
    }


}
