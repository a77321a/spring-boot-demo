package com.xsn.child0822.controller;


import com.xsn.child0822.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
public class TestAsyncService {

    @Autowired
    private AsyncService asyncService;


    @RequestMapping("/async")
    @ResponseBody
    public String testAsync() throws Exception {
        long start = System.currentTimeMillis();
        Future<String> task1 = asyncService.doTask1();
        Future<String> task2 = asyncService.doTask2();
        Future<String> task3 = asyncService.doTask3();

        while (true){
            if(task1.isDone()&&task2.isDone()&&task3.isDone()){
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        return "总时间："+(end-start);
    }
}
