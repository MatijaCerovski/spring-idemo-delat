package com.matija.dao;

import com.matija.model.User;

public interface UserDao {

	User findByUserName(String username);

}