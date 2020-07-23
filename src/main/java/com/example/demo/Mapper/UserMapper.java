package com.example.demo.Mapper;

import com.example.demo.Dao.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    @Select("select  * from users")
    List<User> getAllUsers();

    @Select("select  * from users")
    List<Map<String,Object>> getUserMap();

    @Insert("insert into users(id,age,name,login_name) values(#{id},#{age},#{name},#{login_name})")
    int insert(User user);

    @Insert("insert into users(id,age,name,login_name) values(#{id},#{age},#{name},#{login_name})")
    int insertMap(Map<String,Object> user);
}
