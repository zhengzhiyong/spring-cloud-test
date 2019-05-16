package com.springcloud.base.component;

import com.springcloud.base.service.HelloFeignService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/fallback/provider/hello")
public class HelloFeignServiceFallBack implements HelloFeignService {
    @Override
    public String sayHello(String name) {
        System.out.println("熔断，默认回调函数");
        return "say hello to " + name + "failed";
    }
}
