package com.matija.dao;

import com.matija.model.user.User;

public interface UserDao {

	User findByUserName(String username);

}