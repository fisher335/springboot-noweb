package com.example.demo.service.serviceImpl;

import cn.hutool.log.StaticLog;
import com.example.demo.service.BaseAnimal;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(value = "drap.test",havingValue = "111",matchIfMissing = true)
public class Cat extends BaseAnimal {
    @Override
    public void run() {
        StaticLog.info("this is a cat running !!");
    }
}
