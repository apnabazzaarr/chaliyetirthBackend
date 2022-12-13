package com.chaliyetirth.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chaliyetirth.entities.User;
import com.chaliyetirth.login.Login;
import com.chaliyetirth.services.UserService;


@RestController
public class HomeController {

	@Autowired
	private UserService UserService;	
	
	@GetMapping("/showUser")
	public List<User> showUser()
	{
		return this.UserService.showUser();
	}
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User registerUser)
	{	
		System.out.println(registerUser);
		User register = this.UserService.registerUser(registerUser);
		return new ResponseEntity<>(register, HttpStatus.CREATED);	
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody Login login)
	{
		
		return new ResponseEntity<User>(this.UserService.login(login),HttpStatus.FOUND);
	}
	
}
