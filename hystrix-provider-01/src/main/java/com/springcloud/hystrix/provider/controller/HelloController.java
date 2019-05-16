package com.springcloud.hystrix.provider.controller;


import com.springcloud.hystrix.provider.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/sayHello/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name) {
        return this.helloService.sayHello(name);
    }


}
