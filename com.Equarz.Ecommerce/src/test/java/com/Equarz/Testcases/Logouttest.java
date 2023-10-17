package com.Equarz.Testcases;

	

	import java.awt.AWTException;

	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;


	import com.Pageobjects.*;
	import com.Pageobjects.Login_Functionality;
	import com.base.Testbase;

	public class Logouttest extends Testbase {
		private void Logoutfuncti() {
			// TODO Auto-generated method stub

		} lf;
		Login_Functionality lg;
		
		
		public Logouttest ()
		{
			super();
		}
		
		@BeforeMethod
		public void initialize() 
		{
			
			Setup();
			lg=new Login_Functionality(driver);
			lg.Verifylogin();
			lf=new Logoutfunctionality (driver);		
					
		}
		@Test()
		public void logout() throws InterruptedException, AWTException
		{
			lf.logout();
			
		}
		@Test()
		public void refresh() throws InterruptedException, AWTException
		{
			lf.refresh();
			
		}
		@Test()
		public void back() throws InterruptedException, AWTException
		{
			lf.back();
			
		}



	}

