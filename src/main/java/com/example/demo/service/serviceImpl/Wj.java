package com.example.demo.service.serviceImpl;

import cn.hutool.log.StaticLog;
import com.example.demo.service.People;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class Wj implements People {
    @Override
    public void say() {
        StaticLog.info("this is wenjuan ");
    }
}
