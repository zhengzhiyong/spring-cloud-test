package com.springcloud.hystrix.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HystrixProvider01Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixProvider01Application.class, args);
    }

}
