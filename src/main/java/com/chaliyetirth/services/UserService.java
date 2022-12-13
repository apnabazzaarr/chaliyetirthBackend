package com.chaliyetirth.services;

import java.util.List;

import com.chaliyetirth.entities.User;
import com.chaliyetirth.login.Login;


public interface UserService {

	User registerUser(User registerUser);
	User findUser(int id);
	List<User> showUser();
	User findUserByEmail(String email);
	User login(Login login);

}
