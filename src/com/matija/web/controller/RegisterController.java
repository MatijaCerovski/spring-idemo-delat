package com.matija.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.matija.web.dto.UserRegistrationDTO;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@GetMapping
	public String openRegister(Model model) {
		UserRegistrationDTO user = new UserRegistrationDTO();
		model.addAttribute("user", user);
		return "register";
	}

	@PostMapping
	public ModelAndView registerUser(@ModelAttribute("user") @Valid UserRegistrationDTO user, BindingResult result,
			WebRequest request, Errors errors) {
		// Check if user exist
		// Check if email exist
		// Check if password match
		// If not create user and redirect to login
		// Else redirect to register with error msg

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(user.getUsername());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getMatchingPassword());
		System.out.println("-----------------------------------------------------------------------------------");
		
		
		
	    if (result.hasErrors()) {
	        return new ModelAndView("register", "user", user);
	    } 
	    else {
	    	return new ModelAndView("redirect:/login");
	    	//return "redirect:/login";
	    }
		

		
	}

}
