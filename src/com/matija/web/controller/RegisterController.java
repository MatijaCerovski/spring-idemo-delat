package com.matija.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matija.model.registration.UserRegistration;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@GetMapping
	public String openRegister(Model model){
		UserRegistration user = new UserRegistration();
		model.addAttribute("user", user);
		return "register";
	}
	
	@PostMapping
	public String registerUser(@ModelAttribute("user") UserRegistration user){
		//Check if user exist 
		//Check if email exist
		//Check if password match
		//If not create user and redirect to login
		//Else redirect to register with error msg
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(user.getUsername());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getConfirmedPassword());
		System.out.println("-----------------------------------------------------------------------------------");
		
		return "redirect:/login";
	}

}
