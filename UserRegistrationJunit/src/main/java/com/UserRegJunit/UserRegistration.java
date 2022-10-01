package com.UserRegJunit;

import java.util.regex.*;

public class UserRegistration {
	public boolean checkValidEmail(String email) {

        boolean isEmail;
        String emailRegex = ("[a-z0-9@.]*");
        Pattern patternObject = Pattern.compile(emailRegex);
        Matcher matcher = patternObject.matcher(email);
        return matcher.matches();

	
}

    
}
