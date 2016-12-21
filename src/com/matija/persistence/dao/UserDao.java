package com.matija.persistence.dao;

import java.util.List;

import com.matija.persistence.model.User;
import com.matija.web.dto.UserRegistrationDTO;

public interface UserDao {

	User findByUserName(String username);

	User findByEmail(String email);

	User registerNewUserAccount(UserRegistrationDTO userDTO);
	
	List<User> getUsersForAdminPage(int pageNumber);
	
	Long userTotalCount();

}