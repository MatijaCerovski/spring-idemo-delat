package com.matija.persistence.dao;

import com.matija.persistence.model.User;

public interface UserDao {

	User findByUserName(String username);

}