package com.example.myspringboot1.demos.annotionaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xieGang
 * @description
 * @date 2024/5/12 下午7:26
 **/
@Configuration
@EnableAspectJAutoProxy
//@ComponentScan(basePackages = "com.example.myspringboot1.demos.annotionaop")
//@ComponentScan(basePackages = "com.example.myspringboot1.*")
public class MyConfiguration {


}
