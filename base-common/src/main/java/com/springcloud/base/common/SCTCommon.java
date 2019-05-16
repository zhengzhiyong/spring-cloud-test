package com.springcloud.base.common;

import com.springcloud.base.po.User;

import java.util.ArrayList;
import java.util.List;

public class SCTCommon {
    public static List<User> getUserList(){
        List<User> users = new ArrayList<>();
        for (int i = 0 ;i<10;i++) {
            User user = new User();
            user.setId(i+1);
            user.setPassword("password"+(i+1));
            user.setUsername("spring-cloud-"+(i+1));
            users.add(user);
        }
        return users;
    }

    public static List<User> getUserList(String port){
        List<User> users = new ArrayList<>();
        for (int i = 0 ;i<10;i++) {
            User user = new User();
            user.setId(i+1);
            user.setPassword("password"+(i+1));
            user.setUsername("spring-cloud-"+(i+1));
            user.setPort(port);
            users.add(user);
        }
        return users;
    }
}
