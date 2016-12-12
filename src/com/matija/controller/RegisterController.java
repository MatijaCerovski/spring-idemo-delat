package com.matija.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@GetMapping
	public String openRegister(Model model){
		return "register";
	}
	
	@PostMapping
	public String registerUser(Model model){
		//Check if user exist 
		//If not create user and redirect to login
		//Else redirect to register with error msg
		
		return "redirect:/login";
	}

}
