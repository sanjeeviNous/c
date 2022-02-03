package testcases;

import java.io.IOException;

import org.testng.annotations.*;

import Baseclass.libraryclass;
import pages.loginpage;
import seleniumreusablefunction.seleniumutility;

public class logintestcase extends libraryclass{
	seleniumutility selenium;
	loginpage lp;
	@BeforeMethod
	public void openapp()
	{
		launchapp("chrome","https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void login()
	{
		 lp=new loginpage(driver);
		lp.login("Admin","admin123");
	}
	
	@AfterMethod
	public void teardown() throws IOException
	{
	 selenium=new seleniumutility(driver);
		selenium.screenshot("C:\\Users\\sanjeevin\\git\\c\\hybridcucumber\\src\\test\\resources\\screenshots\\Login.png");
	}
}
