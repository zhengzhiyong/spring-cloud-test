package com.springcloud.zuul.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZuulWeb001Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulWeb001Application.class, args);
    }

}
