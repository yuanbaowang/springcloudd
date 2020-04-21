package com.yuanbw.springcloudd.serviceuserorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceUserOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceUserOrderApplication.class,args);
    }
}
