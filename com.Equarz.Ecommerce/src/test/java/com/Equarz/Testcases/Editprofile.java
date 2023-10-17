package com.Equarz.Testcases;

	

	import java.awt.AWTException;

	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.Pageobjects.*;
	import com.Pageobjects.Login_Functionality;
	import com.base.Testbase;

	public class Editprofile extends Testbase {
		Editprofile ef;
		Login_Functionality lg;
		
		
		public Editprofile ()
		{
			super();
		}
		@BeforeClass
		public void login()
		{
			Setup();
			lg=new Login_Functionality(driver);
			lg.Verifylogin();
			
		}
		@BeforeMethod
		public void initialize() 
		{
			
//			Setup();
//			lg=new Login_Functionality(driver);
//			lg.validateLogin();
			ef=new Editprofile (driver);		
					
		}
		@Test()
		public void search() throws InterruptedException, AWTException
		{
			ef.Editprofie();
			
		}

	}

