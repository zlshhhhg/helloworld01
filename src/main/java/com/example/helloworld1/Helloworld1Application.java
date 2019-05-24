package com.example.helloworld1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Helloworld1Application {
    
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(Helloworld1Application.class, args);
    }

}
