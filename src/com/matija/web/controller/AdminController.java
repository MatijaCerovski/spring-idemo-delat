package com.matija.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.matija.persistence.dao.UserDao;
import com.matija.service.IUserService;


@Controller
public class AdminController {
	
	@Autowired
	@Qualifier("userService")
	IUserService userService;
	
	@Autowired
	UserDao userDao;

	
	@GetMapping("/admin/{pageNumber}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String paginationForm(Model model,@PathVariable int pageNumber){
		
		
		int usersPerPage = 50;
		System.out.println("---------------------------------------------------------"+pageNumber);
		
		Long totalPages = (userDao.userTotalCount()+usersPerPage-1)/usersPerPage;
				
		System.out.println("---------------------------------------------------------"+totalPages.toString());

		
		model.addAttribute("users", userService.getUsersForAdminPage(pageNumber));
		model.addAttribute("totalPages", totalPages);
		
		return "admin";
		
	}
	
}
