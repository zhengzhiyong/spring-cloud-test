package com.springcloud.zuul.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZuulWeb002Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulWeb002Application.class, args);
    }

}
