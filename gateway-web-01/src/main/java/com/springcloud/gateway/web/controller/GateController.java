package com.springcloud.gateway.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class GateController {

	@RequestMapping("get")
	public String getGateway(){
		return "gate-web-001";
	}

}
