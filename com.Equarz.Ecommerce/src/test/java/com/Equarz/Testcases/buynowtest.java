package com.Equarz.Testcases;


	
	import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

import com.Pageobjects.Login_Functionality;
	import com.Pageobjects.buynow;
	import com.base.Testbase;



import org.openqa.selenium.WebDriver;
	import org.testng.annotations.BeforeClass;

	public class buynowtest extends TestAnnotation{
		
		buynow bn;
		Login_Functionality lg;
		
		public buynowtest()
		{
			super();
		}
		@BeforeClass
		public void intialize() throws Throwable {
			
			Setup();
			lg=new Login_Functionality(driver);
			lg.Verifylogin(props.getProperty("username"),props.getProperty("password"));
		    bn = new buynow(Driver);
		     
		}
		@Test
		public void categorybuynow() 
		{
			bn.buynowcategory();
		}
		
		@Test
		public void cartbuynow() throws Throwable 
		{
			bn.buynowcategory();
		}
	}



