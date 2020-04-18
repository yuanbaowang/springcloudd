package com.yuanbw.springcloudd.enurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EnurekaclientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnurekaclientApplication.class,args);
    }
}
