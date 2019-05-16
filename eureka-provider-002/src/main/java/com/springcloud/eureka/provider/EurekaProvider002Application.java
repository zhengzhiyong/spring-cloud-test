package com.springcloud.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaProvider002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider002Application.class, args);
    }

}
