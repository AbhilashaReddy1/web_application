package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewToViewCommunication {
@RequestMapping("/req9")
public String Index()
{
	return "Index";
}
@RequestMapping("/Home1")
public String home()
{
	return "Home1";
}
@RequestMapping("/Contact")
public String contact()
{
return "Contact";	
}
@RequestMapping("/Login")
public String login()
{
	return "Login";
}
@RequestMapping("/Register")
public String register()
{
 return "Register";	
}
}
