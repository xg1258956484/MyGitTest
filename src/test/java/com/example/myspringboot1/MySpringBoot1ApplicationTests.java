package com.example.myspringboot1;

import com.example.myspringboot1.demos.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.*;
import java.util.concurrent.*;

@EnableAsync
@SpringBootTest
class MySpringBoot1ApplicationTests {


    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            3,
            5,
            5,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(10),
            new ThreadFactory() {
                @Override
                public Thread newThread(Runnable r) {
                    Thread thread = new Thread(r);
                    thread.setName("testThread");
                    return thread;
                }
            },
            new RejectedExecutionHandler() {
                @Override
                public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                    System.out.println("拒绝咯");
                }
            }
    );

    @Autowired
    TestService testService;

    @Test
    void contextLoads() throws ExecutionException, InterruptedException {
//        for (int i = 0; i < 100; i++) {
//            testService.async();
//        }
//        try {
//            System.in.read();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//

//        ExecutorService executorService = Executors.newFixedThreadPool(200);
//        threadPoolExecutor.execute(()->{});
//        CompletableFuture<Void> future = CompletableFuture.runAsync(new FutureTask<>(()->{
//            return null;
//        }));
//        future.get();
//        threadPoolExecutor.shutdown();
//        List<Runnable> runnables = threadPoolExecutor.shutdownNow();

        Random rand = new Random();

        // 生成一个在0到999之间的随机整数

        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();

        for (int i = 0; i < 100; i++) {
            int randomInt1 = rand.nextInt(1000);
            int randomInt2 = rand.nextInt(1000);
            int randomInt3 = rand.nextInt(1000);
            list1.add(randomInt1);
            list2.add(randomInt2);
            list3.add(randomInt3);
        }

        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);

        list1.forEach(num -> {
            System.out.print(num + " - ");
        });
        System.out.println();
        list2.forEach(num -> {
            System.out.print(num + " - ");
        });
        System.out.println();
        list3.forEach(num -> {
            System.out.print(num + " - ");
        });


        // 创建新集合用于存放合并结果
        List<Integer> mergedList = new ArrayList<>();

        // 创建三个索引指针
        int index1 = 0, index2 = 0, index3 = 0;

        // 处理剩余元素（改进版）
        while (index1 < list1.size() || index2 < list2.size() || index3 < list3.size()) {
            // 找出三个集合当前指针的最小值（考虑已遍历完的情况）
            Integer min1 = index1 < list1.size() ? (Integer) list1.get(index1) : Integer.MAX_VALUE;
            Integer min2 = index2 < list2.size() ? (Integer) list2.get(index2) : Integer.MAX_VALUE;
            Integer min3 = index3 < list3.size() ? (Integer) list3.get(index3) : Integer.MAX_VALUE;

            int min = Math.min(Math.min(min1, min2), min3);
            mergedList.add(min);

            // 移动对应集合的指针
            if (min == min1) {
                index1++;
            } else if (min == min2) {
                index2++;
            } else {
                index3++;
            }
        }


        // 输出合并后的结果
        System.out.println("\n合并后的有序集合:");
        mergedList.forEach(num -> System.out.print(num + " - "));


    }


    static int[] num = new int[1000000000];

    static {
//        long start2 = System.nanoTime();
//        for (int i = 0; i < num.length; i++) {
//            num[i] = (int) (Math.random()*1000);
//        }
//        long end2 = System.nanoTime();
//        System.out.println("单线程设置10亿数组参数耗时："+(end2-start2));
    }

    public static void main(String[] args) {
        long start2 = System.nanoTime();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        setArrarTask setArrarTask = new setArrarTask(0, num.length - 1, 100000000);
        forkJoinPool.execute(setArrarTask);
        long end2 = System.nanoTime();
        System.out.println("setArrarTask设置10亿数组参数耗时：" + (end2 - start2));

        //单线程
        int sum = 0;
        long start = System.nanoTime();
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        long end = System.nanoTime();

        System.out.println("单线程的sum：" + sum + "//////耗时：" + (end - start));

        long start1 = System.nanoTime();

        testTask testTask = new testTask(0, num.length - 1, 100000000);
        forkJoinPool.execute(testTask);
        long end1 = System.nanoTime();
        System.out.println("forkjionPool的sum：" + sum + "//////耗时：" + (end1 - start1));


    }


    private static class testTask extends RecursiveTask<Integer> {
        int sum = 0;
        int count;
        int start;
        int end;

        testTask(int start, int end, int count) {
            this.start = start;
            this.end = end;
            this.count = count;
        }

        @Override
        protected Integer compute() {

            if (end - start <= count) {
                for (int i = start; i <= end; i++) {
                    num[i] = (int) (Math.random() * 1000);
                }
            } else {
                int middle = (start + end) / 2;
                testTask left = new testTask(start, middle, count);
                testTask right = new testTask(middle + 1, end, count);
                left.fork();
                right.fork();
                sum = left.join() + right.join();
            }
            return sum;
        }
    }


    private static class setArrarTask extends RecursiveAction {
        int sum = 0;
        int count;
        int start;
        int end;

        setArrarTask(int start, int end, int count) {
            this.start = start;
            this.end = end;
            this.count = count;
        }

        @Override
        protected void compute() {

            if (end - start <= count) {
                for (int i = start; i <= end; i++) {
                    num[i] = (int) (Math.random() * 1000);
                }
            } else {
                int middle = (start + end) / 2;
                testTask left = new testTask(start, middle, count);
                testTask right = new testTask(middle + 1, end, count);
                left.fork();
                right.fork();
            }
        }
    }
}
