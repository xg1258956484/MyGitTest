package com.example.myspringboot1.demos.propertyaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xieGang
 * @description
 * @date 2024/5/12 下午7:07
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Car car = context.getBean(Car.class);
        System.out.println(car.getOil(10));
    }
}
