package com.springcloud.zuul.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zw001")
public class UserController {

	@RequestMapping("get")
	public String getUser(){
		return "zuul-web-001";
	}

}
