package com.UserRegJunit;

import java.util.regex.*;

public class UserRegistration {
			
	public boolean checkValidEmail(String email)
	{
        Pattern patternObject = Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");
        Matcher matcher = patternObject.matcher(email);
        return matcher.matches();

	}
	


	

    
}
