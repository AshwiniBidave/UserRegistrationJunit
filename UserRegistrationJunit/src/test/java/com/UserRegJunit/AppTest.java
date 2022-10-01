package com.UserRegJunit;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
	@Test
    public void ValideEntryOfUser(){
        UserRegistration ur=new UserRegistration();
		assertEquals(true, ur.checkValidFirstName("Ash"));
		assertEquals(true, ur.checkValidLastName("Shhhhh"));
		assertEquals(true, ur.checkValidEmail("ash19@gmail.com"));
		assertEquals(true, ur.checkValidMobileNumber("91 9999999999"));
		assertEquals(true, ur.password("Avsoju9$"));
		if(true) {
			System.out.println("Happy");
		}
	

		


	
	}
}
