package com.springcloud.eureka.consumer.controller;

import com.springcloud.base.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

	@RequestMapping("get{id}")
	public User getUser(@PathVariable("id") Integer id){
		return new User(1,"zhangsan"+id,"password"+id,"8083");
	}

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("get/{id}")
    public User get(@PathVariable("id") Integer id){
        List<ServiceInstance> list = this.discoveryClient.getInstances("USER-API");
        String uri = "";
        for (ServiceInstance instance : list) {
            if (instance.getUri() != null && !"".equals(instance.getUri().toString())) {
                uri = instance.getUri().toString();
                break;
            }
        }
        User user = null;
//        try{
            user = restTemplate.getForObject(uri + "/provider/user/get/" + id, User.class);
//        }catch (Exception e){
            //e.printStackTrace();
 //下面的错误需要在User对象中创建无参构造方法
//            Caused by: com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of com.springcloud.base.po.User:
//            no suitable constructor found, can not deserialize from Object value (missing default constructor or creator, or perhaps need to add/enable type information?)
//                at [Source: java.io.PushbackInputStream@13b10596; line: 1, column: 2]
//        }
        return user;
    }
}
