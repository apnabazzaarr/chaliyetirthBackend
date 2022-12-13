package com.chaliyetirth.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaliyetirth.dao.UserDao;
import com.chaliyetirth.entities.User;
import com.chaliyetirth.expection.ResourceNotFoundException;
import com.chaliyetirth.login.Login;

@Service
public class UserServiceImplement implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	@Override
	public User registerUser(User registerUser) {
		return this.userDao.save(registerUser);
	}


	@Override
	public List<User> showUser() {
		return this.userDao.findAll();
	}


	@Override
	public User findUser(int id) {
		return  this.userDao.findById((int) id).orElseThrow(()-> new ResourceNotFoundException("User","id",id));
		//return User;
	}


	@Override
	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return this.findUserByEmail(email);
	}


	@Override
	public User login(Login login) {
		// TODO Auto-generated method stub
		User found = new User();
		 found=  this.userDao.findOneByEmailAndPassword(login.getEmail(),login.getPassword());
		if(found== null)
		{
			return null;
		}
		return found;
	}

}
