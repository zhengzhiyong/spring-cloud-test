package com.springcloud.gateway.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayWeb01Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayWeb01Application.class, args);
    }

}
