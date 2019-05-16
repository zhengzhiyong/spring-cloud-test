package com.springcloud.base.service;

//import com.springcloud.base.component.HelloFeignServiceFallBack;
import com.springcloud.base.configuration.HelloFeignConfiguration;
import com.springcloud.base.factory.HelloFeignFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *   fallbackFactory:表示调用服务出现问题时可以打印出相应日志
 *   如果需要访问产生回退触发器的原因，可以使用@ feignclient中的fallbackFactory属性。
 */
@FeignClient(value = "SAY-HELLO"
//       , fallback = HelloFeignServiceFallBack.class
       , fallbackFactory = HelloFeignFactory.class
       ,configuration = HelloFeignConfiguration.class
)
@RequestMapping("/provider/hello")
public interface HelloFeignService {
    @RequestMapping("/sayHello/{name}")
    String sayHello(@PathVariable("name") String name);
}
