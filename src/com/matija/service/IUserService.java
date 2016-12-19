package com.matija.service;

import com.matija.persistence.model.User;
import com.matija.web.dto.UserRegistrationDTO;

public interface IUserService {

	public User saveUser(UserRegistrationDTO userDTO);
	
}
