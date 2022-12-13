package com.chaliyetirth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaliyetirth.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{

	User findOneByEmailAndPassword(String email,String passwoed);
	
}
