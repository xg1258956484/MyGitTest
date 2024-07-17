package com.example.myspringboot1.demos.annotionaop;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xieGang
 * @description
 * @date 2024/5/12 下午7:27
 **/
public class Test {

    static int num = 0;
    public static void main(String[] args) throws NoSuchMethodException {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(MyConfiguration.class);
//        context.refresh();
//        UserService service = context.getBean(UserService.class);
//        service.setUserAge1();




        for (int i = 1; i <= 2 ; i++) {
            new Thread(()->{
                for (int j = 0; j < 10000000; j++) {
                    num++;
                }
            }).start();
        }


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(num);
    }
//
//    private static void run() {
//
//    }

//    private static volatile int i = 0;
//
//    public static void main(String[] args) {
//        Thread t1 = new IncrementThread();
//        Thread t2 = new IncrementThread();
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Final value of i: " + i);
//    }
//
//    static class IncrementThread extends Thread {
//        public void run() {
//            for (int j = 0; j < 1000000; j++) {
//                i++;
//            }
//        }
//    }
}
