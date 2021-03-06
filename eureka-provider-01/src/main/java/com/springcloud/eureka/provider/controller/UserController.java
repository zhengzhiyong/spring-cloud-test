package com.springcloud.eureka.provider.controller;

import com.springcloud.base.po.User;
import com.springcloud.eureka.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provider/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get/{id}")
    public User get(@PathVariable("id") Integer id) {
        return this.userService.getById(id);
    }

    @RequestMapping("list")
    public List<User> getUserList(){
        return this.userService.getUserList();
    }
}
