package com.UserRegJunit;

import java.util.regex.*;

public class UserRegistration {
	public boolean checkValidFirstName(String firstName)
	{
		String firstNameRegex  = "^[A-Z]{1}[a-z]{2,}$";
	    Pattern pattern = Pattern.compile(firstNameRegex );
	    Matcher matcher = pattern.matcher(firstName);
	    return matcher.matches();

	}
	public boolean checkValidLastName(String lastName)
	{
        String lastNameRegex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
	public boolean checkValidMobileNumber(String mobileNumber)
	{
        String mobileRegex = "^(91){1}[ ]+[0-9]{10}$";
        Pattern patternObject = Pattern.compile(mobileRegex);
        Matcher matcher = patternObject.matcher(mobileNumber);
        return matcher.matches();
     }	
	public boolean checkValidEmail(String email)
	{

        boolean isEmail;
        String emailRegex = ("[a-z0-9@.]*");
        Pattern patternObject = Pattern.compile(emailRegex);
        Matcher matcher = patternObject.matcher(email);
        return matcher.matches();

	}
	


	public boolean password(String password) {
        String regex ="^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]){1}(?=.*[@#$%!]){1}.{8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    
}
