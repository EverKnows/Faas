package com.faas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.EnableAsync;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

@SpringBootApplication
@EnableAsync
@MapperScan("com.faas.mapper")
@ServletComponentScan
public class FaasApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(FaasApplication.class);


        //SpringApplication.run(FaasApplication.class);

        ConfigurableApplicationContext cont = springApplication.run();


    }

}
