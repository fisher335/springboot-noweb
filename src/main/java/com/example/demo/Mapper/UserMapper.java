package com.example.demo.Mapper;

import com.example.demo.Dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select  * from users")
    List<User> getAllUsers();
}
