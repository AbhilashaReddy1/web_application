package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FullName {
@RequestMapping("/")
public String home() {
	return "Name";
}
@RequestMapping("/req1")
public String fullname(@RequestParam String fname,@RequestParam String lname,ModelMap m)
{
m.put("key1",fname);
m.put("key2",lname);
String fullname = fname+" "+lname;
m.put("FullName", fullname);
return "Result";
}
}

















