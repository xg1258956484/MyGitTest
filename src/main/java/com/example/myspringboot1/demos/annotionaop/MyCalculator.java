package com.example.myspringboot1.demos.annotionaop;

import org.springframework.stereotype.Component;

/**
 * @author xieGang
 * @description
 * @date 2024/5/12 下午7:25
 **/
@Component
public class MyCalculator {
    public Integer add(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i+j;
        return result;
    }

    public Integer sub(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i-j;
        return result;
    }

    public Integer mul(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i*j;
        return result;
    }

    public Integer div(Integer i, Integer j) throws NoSuchMethodException {
        Integer result = i/j;
        return result;
    }

    public Integer show(Integer i){
        System.out.println("show .....");
        return i;
    }
}
