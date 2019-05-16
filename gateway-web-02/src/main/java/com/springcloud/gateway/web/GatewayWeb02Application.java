package com.springcloud.gateway.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayWeb02Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayWeb02Application.class, args);
    }

}
