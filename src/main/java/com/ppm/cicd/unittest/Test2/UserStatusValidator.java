package com.ppm.cicd.unittest.Test2;

public class UserStatusValidator {
	
	public boolean isValidUser(String userName , int age) {
		
		if ((userName == null ) || (userName.trim().isEmpty())){
			return false;
		}
		
		//User must be at least 18 years old to register
		if((age <18) || (age >120)){
			return false;
		}
		
		return true;
	}

}
