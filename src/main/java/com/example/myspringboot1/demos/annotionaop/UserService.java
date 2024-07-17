package com.example.myspringboot1.demos.annotionaop;

import com.example.myspringboot1.demos.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

/**
 * @author xieGang
 * @description
 * @date 2024/5/14 下午2:48
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;



    public void setUserAge1(){
        userMapper.updateAge1();
        setUserAge2();
        int i = 10/0;
    }

    @Transactional
    public void setUserAge2(){
        userMapper.updateAge2();

    }
}
