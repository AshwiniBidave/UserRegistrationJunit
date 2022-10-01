package com.UserRegJunit;

import java.util.regex.*;

public class UserRegistration {
	public boolean checkValidMobileNumber(String mobileNumber) {

        boolean isMobileNumber;
        String mobileRegex = "^(91){1}[ ]+[0-9]{10}$";
        Pattern patternObject = Pattern.compile(mobileRegex);
        Matcher matcher = patternObject.matcher(mobileNumber);
        return matcher.matches();

	
}

    
}
