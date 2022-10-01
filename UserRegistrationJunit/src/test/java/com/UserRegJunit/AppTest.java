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
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void checkFirstName(){
        UserRegistration ur=new UserRegistration();
        assertEquals(true, ur.checkValidFirstName("Sarita"));
    }
    @Test
    public void checkLastName(){
        UserRegistration ur=new UserRegistration();
		assertEquals(true, ur.checkValidLastName("Shinde"));
    }

}
