package com.example.myspringboot1.demos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xieGang
 * @description
 * @date 2024/5/24 下午9:43
 **/
@Controller
public class TestController {

    @Autowired
    private TestService testService;


    @GetMapping("/test")
    public void test() {
        testService.testGcThread();
    }
}
