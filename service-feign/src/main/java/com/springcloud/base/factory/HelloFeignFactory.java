package com.springcloud.base.factory;

import com.springcloud.base.component.HelloFeignServiceFallBack;
import com.springcloud.base.service.HelloFeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignFactory implements FallbackFactory<HelloFeignService> {
    private final HelloFeignServiceFallBack helloFeignServiceFallBack;

    public HelloFeignFactory(HelloFeignServiceFallBack helloFeignServiceFallBack){
        this.helloFeignServiceFallBack = helloFeignServiceFallBack;
    }

    @Override
    public HelloFeignService create(Throwable throwable) {
        throwable.printStackTrace();
        return helloFeignServiceFallBack;
    }
}
