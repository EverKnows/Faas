package com.faas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class FaasApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaasApplication.class, args);
    }

}
