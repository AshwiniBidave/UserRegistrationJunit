package com.UserRegJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
	@Test
    public void checkPassWordRule3(){
        UserRegistration ur=new UserRegistration();
		assertEquals(true, ur.passwordRule1("Ashusoju9"));
    }
    

}
