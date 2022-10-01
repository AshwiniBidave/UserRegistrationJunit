package com.UserRegJunit;

import java.util.regex.*;

public class UserRegistration {
	
	public boolean checkValidFirstName(String firstName) {

     boolean isFirstName;
	String firstNameRegex  = "^[A-Z]{1}[a-z]{2,}$";
    Pattern pattern = Pattern.compile(firstNameRegex );
    Matcher matcher = pattern.matcher(firstName);
    return matcher.matches();

	}
    public boolean checkValidLastName(String lastName) {

        boolean isLastName;
        String lastNameRegex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    
}
