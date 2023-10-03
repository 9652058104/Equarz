package com.Equarz.Testcases;


	

	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;


	import com.Pageobjects.Login_Functionality;

import com.Pageobjects.searchfunctionality;
import com.base.Testbase;

	public class searchtest extends Testbase {
		searchfunctionality bf;
		Login_Functionality lg;


		public searchtest()
		{
			super();
		}
		@BeforeMethod
		public void initialize() throws InterruptedException
		{

			Setup();
			lg=new Login_Functionality(driver);
			lg.Verifylogin();
			bf=new searchfunctionality(driver);		

		}
		@Test()
		public void search () throws InterruptedException 
		{
			bf.validatesearch();

		}
		@Test()
		public void searchdrop () throws InterruptedException 
		{
			bf.dropdownsearch();

		}
	}

