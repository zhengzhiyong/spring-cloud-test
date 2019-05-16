package com.springcloud.base.common.service;

import com.springcloud.base.common.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="USER-API")
public interface UserFeignService {

    @RequestMapping("/provider/user/get/{id}")
    User get(@PathVariable("id") Integer id);
}
