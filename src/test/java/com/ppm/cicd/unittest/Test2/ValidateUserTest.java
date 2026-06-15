package com.ppm.cicd.unittest.Test2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidateUserTest {
	
	private final UserStatusValidator validator= new UserStatusValidator();
	
	@Test
	public void returnFalse_WhenNameIsEmpty() {
		//Set Empty name
		String name = "";
		int age = 18;
		
		//Act
		boolean result = validator.isValidUser(name, age);
		
		//Assert
		assertFalse(result,"Validation must fail when empty name is passed");
		
		
	}
	
	@Test
	public void returnFalse_WhenNameIsNull() {
		//Set null value to name
		String name = null;
		int age = 18;
		
		//Act
		boolean result = validator.isValidUser(name, age);
		
		//Assert
		assertFalse(result,"Validation must fail when name is null");
	}
	
	@Test
	public void returnFalse_WhenAgeIsUnder18() {
		//Set age to under 18
		String name = "Ko Ko";
		int age = 10;
		
		//Act
		boolean result = validator.isValidUser(name, age);
		
		//Assert
		assertFalse(result,"Validation must fail when age is under 10");
	}
	
	@Test
	public void returnFalse_WhenAgeIsOver120() {
		//Set age to over 120
		String name = "David";
		int age = 150;
		
		//Act
		boolean result = validator.isValidUser(name, age);
		
		//Assert
		assertFalse(result,"Validation must fail when age is over 120");
	}
	
	@Test
	public void returnTrue_WhenNameAndAgeAreCorrect() {
		//Set name value and correct age
		String name = "Zaw Zaw";
		int age = 39;
		
		//Act
		boolean result = validator.isValidUser(name, age);
		assertTrue(result,"Validation must pass when name and age values are valid values");
	}

}
