package com.matija.user.dao;

import com.matija.user.model.User;

public interface UserDao {

	User findByUserName(String username);

}