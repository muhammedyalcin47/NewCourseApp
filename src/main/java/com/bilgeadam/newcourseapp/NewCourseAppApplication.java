package com.bilgeadam.newcourseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NewCourseAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewCourseAppApplication.class, args);
    }

}
