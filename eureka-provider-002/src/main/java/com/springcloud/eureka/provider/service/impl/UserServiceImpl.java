package com.springcloud.eureka.provider.service.impl;

import com.springcloud.base.common.po.User;
import com.springcloud.eureka.provider.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
	
	private static Map<Integer, User> map;
	
	static {
		map = new HashMap<>();
		for (int i=1; i<6; i++) {
			map.put(i, new User(i,"test" +i , "pwd" + i+"  port:"+ 8082));
		}
	}

	@Override
	public User getById(Integer id) {
		return map.get(id);
	}

}
