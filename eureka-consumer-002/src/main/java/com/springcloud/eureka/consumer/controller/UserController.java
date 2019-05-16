package com.springcloud.eureka.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.base.po.User;
import com.springcloud.base.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("get/{id}")
    @HystrixCommand(fallbackMethod = "error")
    public User get(@PathVariable("id")Integer id){
        return this.userFeignService.get(id);
    }

    @RequestMapping("list")
    public List<User> getUserList(){
        return this.userFeignService.getUserList();
    }

    public User error(Integer id){
        User user = new User();
        user.setPort("0000");
        user.setUsername("error");
        user.setPassword("error");
        user.setId(id);
        return user;
    }

}
