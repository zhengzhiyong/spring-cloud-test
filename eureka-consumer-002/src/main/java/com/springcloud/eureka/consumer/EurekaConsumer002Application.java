package com.springcloud.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableHystrixDashboard
@EnableFeignClients(basePackages={"com.springcloud.*"})
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"com.springcloud.*"})
/**
 * Caused by: java.lang.IllegalStateException: No fallback instance of type class com.springcloud.base.component.HelloFeignServiceFallBack found for feign client SAY-HELLO
 * 解决办法：
 *    在 @SpringBootApplication 中 添加扫描包路径 scanBasePackages = {"com.springcloud.*"}
 *
 */
public class EurekaConsumer002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumer002Application.class, args);
    }

}
