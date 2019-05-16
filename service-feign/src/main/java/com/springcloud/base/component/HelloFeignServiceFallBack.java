package com.springcloud.base.component;

import com.springcloud.base.service.HelloFeignService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/fallback/provider/hello")
public class HelloFeignServiceFallBack implements HelloFeignService {
    @Override
    public String sayHello(String name) {
        return "say hello to " + name + " failed 熔断";
    }
}
