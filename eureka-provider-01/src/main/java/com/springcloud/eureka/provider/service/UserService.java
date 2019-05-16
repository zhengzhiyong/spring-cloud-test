package com.springcloud.eureka.provider.service;


import com.springcloud.base.po.User;

import java.util.List;

public interface UserService {
	User getById(Integer id);

	List<User> getUserList();
}
