package com.chaliyetirth.expection;

public class ApiResponse {

	String message;
	boolean sucess;
	
	public ApiResponse(String message, boolean sucess) {
		super();
		this.message = message;
		this.sucess = sucess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean getSucess() {
		return sucess;
	}

	public void setSucess(boolean sucess) {
		this.sucess = sucess;
	}
	
	
	
}
