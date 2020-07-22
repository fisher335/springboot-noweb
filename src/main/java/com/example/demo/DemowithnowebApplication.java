package com.example.demo;

import com.example.demo.service.BaseAnimal;
import com.example.demo.service.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemowithnowebApplication implements CommandLineRunner {

    @Autowired
    @Qualifier(value = "cat")
    public BaseAnimal as;

    @Autowired()
    @Qualifier(value = "wj")
    public People ps;


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemowithnowebApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) {
        ps.say();
    }
}
