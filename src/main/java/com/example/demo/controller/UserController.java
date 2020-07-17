package com.example.demo.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  
	@RequestMapping("/api/user")
	public Principal User(Principal user) 
	{
		return user;
	}
}
