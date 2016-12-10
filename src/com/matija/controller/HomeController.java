package com.matija.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Secured("ROLE_USER")
	@GetMapping("/home")
	public String getLogin(Model model){
		return "home";
	}
}
