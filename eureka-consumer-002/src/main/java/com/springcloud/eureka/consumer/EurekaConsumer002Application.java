package com.springcloud.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages={"com.springcloud.eureka.consumer","com.springcloud.base.common.service"})
@EnableEurekaClient
@SpringBootApplication
public class EurekaConsumer002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumer002Application.class, args);
    }

}
