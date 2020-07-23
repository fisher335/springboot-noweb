package com.example.demo.service;

import com.example.demo.Dao.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> getAllUsers();
    List<Map<String,Object>> getUserMap();
    int insert(User user);
    int insertMap(Map<String,Object> user);
}
