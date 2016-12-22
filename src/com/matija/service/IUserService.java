package com.matija.service;

import java.util.List;

import com.matija.persistence.model.User;
import com.matija.web.dto.UserRegistrationDTO;

public interface IUserService {

	public User saveUser(UserRegistrationDTO userDTO);
	
	public List<User> getUsersForAdminPage(int pageNumber);
	
}
