package com.springcloud.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaProvider01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider01Application.class, args);
    }

}
