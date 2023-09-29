package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import com.Pageobjects.Login_Functionality;
import com.Pageobjects.whishlist;
import com.Utils.Utils;
import com.base.Testbase;
import com.base.Testbase;

public class WishlistTest extends Testbase{
	whishlist pf;
	Login_Functionality lg;
	
	
	public WishlistTest()
	{
		super();
	}
	@BeforeMethod
	public void initialize() throws InterruptedException
	{
		
		Setup();
		lg=new Login_Functionality(driver);
		lg.Verifylogin();
		pf=new whishlist(driver);		
				
	}
	@Test()
	public void categorywishlist () throws InterruptedException 
	{
		pf.catwishlist();
		
	}
	
	@Test()
	public void searchwishlist() 
	{
		pf.searchwishlist();
	}
	@Test()
	public void bannerhwishlist() 
	{
		pf.bannerwishlist();
	}
	@Test()
	public void homehwishlist() 
	{
		pf.homewishlist();
	}
	@Test()
	public void dealswishlist() 
	{
		pf.dealswishlist();
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}


}