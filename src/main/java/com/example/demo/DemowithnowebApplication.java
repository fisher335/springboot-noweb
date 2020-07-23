package com.example.demo;

import com.example.demo.Dao.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemowithnowebApplication implements CommandLineRunner {

    @Autowired
    private UserService us;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemowithnowebApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) {
//        List<Map<String,Object>> li = us.getUserMap();
//        li.forEach(user -> System.out.println(user.toString()));
        User a = new User("ztz","ztz",11);

        Map<String,Object> b = new HashMap<>();
        b.put("name","天天向上");
        b.put("login_name","fsm");
        b.put("age",11);
        us.insertMap(b);
    }
}
