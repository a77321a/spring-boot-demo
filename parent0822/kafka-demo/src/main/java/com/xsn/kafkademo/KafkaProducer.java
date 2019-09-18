package com.xsn.kafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.UUID;

@Component
@EnableScheduling
public class KafkaProducer {
    @Autowired
    private KafkaTemplate kafkaTemplate;
    @Scheduled(cron = "00/1 * * * * ?")
    public void send(){
        String msg = UUID.randomUUID().toString();
//        send方法返回值是 ListenableFuture
        ListenableFuture future = kafkaTemplate.send("test-kafka",msg);
        future.addCallback(o -> System.out.println("send-消息发送成功"+msg),throwable -> System.out.println("消息发送失败"+msg));

    }
}
