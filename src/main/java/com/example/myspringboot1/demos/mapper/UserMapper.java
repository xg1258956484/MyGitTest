package com.example.myspringboot1.demos.mapper;

import com.example.myspringboot1.demos.pojo.User;
import com.example.myspringboot1.demos.pojo.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author xieGang
 * @description
 * @date 2024/4/28 下午1:11
 **/
public interface UserMapper {


    UserDTO getUserByNameAndPassWord(User user);

    @Update("update User set age = age- 1 where name = '王五'")
    void updateAge1();

    @Update("update User set age = age- 2 where name = '王五'")
    void updateAge2();

}
