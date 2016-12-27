package com.matija.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ConsoleController {
	
	@PostMapping("/console")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ModelAndView consoleCommand(@RequestParam String command){
		
		String[] splited = command.split("\\s+");
		
		System.out.println("---------------------------------------------------------------------------------------");
		for(String tmp : splited){
			System.out.println(tmp.toString());
		}
		System.out.println("---------------------------------------------------------------------------------------");
		
		return new ModelAndView("redirect:/admin/1");
	}
	
	

}
