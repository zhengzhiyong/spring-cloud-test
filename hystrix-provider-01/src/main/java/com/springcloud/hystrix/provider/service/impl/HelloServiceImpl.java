package com.springcloud.hystrix.provider.service.impl;

import com.springcloud.hystrix.provider.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "hello " + name;
	}
}
