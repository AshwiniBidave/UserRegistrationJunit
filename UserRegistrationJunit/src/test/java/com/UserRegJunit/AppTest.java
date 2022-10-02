package com.UserRegJunit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
	public class AppTest 
	{
		String email;
		boolean expection;
		UserRegistration ur;
		@Before
	    public void init() {
		ur=new UserRegistration();
		}
		public AppTest(String email,boolean expection) {
			this.email=email;
			this.expection=expection;
			
		}
@Parameterized.Parameters
	    public static Collection inputs(){
			return Arrays.asList(new Object[][]{
				{"abc@bridgelabz.co.in",true},{"abc@gmail.com.com",true},{"abc@yahoo.com",true},
				{"abc@1.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc111@abc.com",true},
				{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc+100@gmail.com",true}
				
			}
			);
			}
		@Test
		public void checkFirstname() {
		assertEquals(this.expection, ur.checkValidEmail(this.email));	
		}

	

		


	
	}

