package com.example.demo.service.serviceImpl;

import com.example.demo.Dao.User;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserMapper userMapper;
    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
