package com.ch.fin_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FinDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinDemoApplication.class, args);
    }

}
