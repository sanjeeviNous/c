package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.libraryclass;

public class loginpage extends libraryclass {
	WebDriver driver;
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement login;
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	public void login(String uname,String psword)
	{
		username.sendKeys(uname);
		password.sendKeys(psword);
	
		
	}
	
	public void submit() {
		login.click();
		
	}
}
