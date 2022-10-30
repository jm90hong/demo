package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.UserService;
import com.example.demo.vo.User;

@Controller
public class HomeController {

	@Autowired
	UserService userService;
	
	
	
	@GetMapping(value="/")
	public @ResponseBody User home() {
	
		System.out.println(userService.getUser(3));
		
		return userService.getUser(3);
	}
}
