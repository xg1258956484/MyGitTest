package com.example.myspringboot1.demos.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.*;

/**
 * @author xieGang
 * @description
 * @date 2024/5/23 下午4:38
 **/
@Component
public class TestService {

    @Async
    public void async() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }


    public void testGcThread(){
        ExecutorService threadPool = new ThreadPoolExecutor(200, 200,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());

        for (int i = 1; i < 200; i++) {
            final int j = i;
            threadPool.execute(()->{
                System.out.println(Thread.currentThread().getName()+"////"+j);
            });
        }
//        threadPool.shutdown();


    }


}
