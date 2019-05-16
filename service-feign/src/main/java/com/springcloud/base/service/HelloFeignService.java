package com.springcloud.base.service;

//import com.springcloud.base.component.HelloFeignServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SAY-HELLO"
//       , fallback = HelloFeignServiceFallBack.class
)
@RequestMapping("/provider/hello")
public interface HelloFeignService {
    @RequestMapping("/sayHello/{name}")
    String sayHello(@PathVariable("name") String name);
}
