package com.chaliyetirth.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotBlank
	@Size(min=5,max=250,message="Name must be greater than 5 character")
	private String name;
	@Email
	@Column(length=50, unique = true, name="stuEmail")
	private String email;
	@NotBlank
	@Size(min=8,max=250,message="password must be at least 8 character")
	private String password;
	@NotBlank
	@Size(min=10,max=250,message="Mobile number must be of 10 character")
	private String mobileNo;
	@NotBlank
	@Size(min=3,max=250,message="city must be at least 3 character")
	private String city;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String name, String email, String password, String mobileNo, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobileNo = mobileNo;
		this.city = city;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
