package com.example.myspringboot1;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAsync
@EnableTransactionManagement
@MapperScan("com.example.myspringboot1.demos.mapper")
public class MySpringBoot1Application {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBoot1Application.class, args);
    }

}
