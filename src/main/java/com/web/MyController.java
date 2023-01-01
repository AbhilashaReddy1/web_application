package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MyController{
	@RequestMapping("/req3")
	@ResponseBody()
	public String home() {
		return" Welcome to SpringBoot Application! ";
	}

}