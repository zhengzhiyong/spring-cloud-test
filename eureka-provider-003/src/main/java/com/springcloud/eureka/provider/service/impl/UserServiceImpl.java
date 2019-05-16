package com.springcloud.eureka.provider.service.impl;

import com.springcloud.base.common.SCTCommon;
import com.springcloud.base.po.User;
import com.springcloud.eureka.provider.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

	protected List<User> userList(){
		return SCTCommon.getUserList("8083");
	}

	@Override
	public User getById(Integer id) {
		int i = (id <= userList().size()-1) ? id : 0;
		return userList().get(i);
	}

	@Override
	public List<User> getUserList() {
		return userList();
	}


}
