package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Second {
@RequestMapping("/req")
public String home()
{
	return "home";
}

}
