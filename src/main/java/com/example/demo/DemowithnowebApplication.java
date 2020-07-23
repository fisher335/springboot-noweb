package com.example.demo;

import com.example.demo.Dao.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

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
        List<User> li = us.getAllUsers();
        li.forEach(user -> System.out.println(user.toString()));
    }
}
