package com.UserRegJunit;

import java.util.regex.*;

public class UserRegistration {
	public boolean passwordRule1(String password) {
        String regex = "^[a-zA-Z]{8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    
}
