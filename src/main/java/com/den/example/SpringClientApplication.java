package com.den.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication
public class SpringClientApplication  {
    public static void main(String[] args) {
        SpringApplication.run(SpringClientApplication.class,args);

    }
}
