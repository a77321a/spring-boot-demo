package com.xsn.child0822.service;

import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.Future;

@Service
public class AsyncServiceImpl implements AsyncService {
    private static Random random = new Random();
    @Override
    public Future<String> doTask1() throws Exception {
        System.out.println("任务1开始");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = System.currentTimeMillis();
        System.out.println("任务1耗时:"+(end-start));
        return new AsyncResult<>("任务1结束");
    }

    @Override
    public Future<String> doTask2() throws Exception {
        System.out.println("任务2开始");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = System.currentTimeMillis();
        System.out.println("任务2耗时:"+(end-start));
        return new AsyncResult<>("任务2结束");
    }

    @Override
    public Future<String> doTask3() throws Exception {
        System.out.println("任务3开始");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = System.currentTimeMillis();
        System.out.println("任务3耗时:"+(end-start));
        return new AsyncResult<>("任务3结束");
    }
}
