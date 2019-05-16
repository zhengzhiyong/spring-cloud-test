package com.springcloud.base.service;

import com.springcloud.base.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value="USER-API")
public interface UserFeignService {

    @RequestMapping("/provider/user/get/{id}")
    User get(@PathVariable("id") Integer id);

    @RequestMapping("/provider/user/list")
    List<User> getUserList();
}
