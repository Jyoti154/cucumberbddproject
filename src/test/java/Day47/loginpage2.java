package Day47;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginpage2 
{
	
	
	WebDriver driver;
	loginpage2 (WebDriver driver)
	{
	this.driver=driver;
	//usingpagefactory
	PageFactory.initElements(driver, this);
	}
	
	//locators
/*
	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");	
	By loginbtn_loc=By.xpath("//button[normalize-space()='Login']")	;
		*/
	
	
	//usingpagefactory
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login_btn;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
		//actions methods
	public void setusername(String user)
	{
		 txt_username.sendKeys(user);
	}
	public void setpassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	public void clicklogin()
	{
		login_btn.click();	
	}
	
	
}
