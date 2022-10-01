package com.UserRegJunit;

import java.util.regex.*;

public class UserRegistration {
	public boolean passwordRule1(String password) {
        String regex = "^[A-Z]{1}[a-zA-Z]{7}[0-9]{1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    
}
