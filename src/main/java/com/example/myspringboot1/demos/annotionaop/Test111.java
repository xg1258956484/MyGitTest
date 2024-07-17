package com.example.myspringboot1.demos.annotionaop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xieGang
 * @description
 * @date 2024/5/28 下午11:53
 **/

@Configuration
public class Test111 {

    @Bean
    public String hello() {
        return new String("111");
    }
}
