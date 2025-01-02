package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//withoutusing pagefactory 
	//constructor
	WebDriver driver;
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators

By txt_username_loc=By.xpath("//input[@placeholder='Username']");
By txt_password_loc=By.xpath("//input[@placeholder='Password']");	
By loginbtn_loc=By.xpath("//button[normalize-space()='Login']")	;
	
	//actions methods
public void setusername(String user)
{
	driver.findElement(txt_username_loc).sendKeys(user);
}
public void setpassword(String pwd)
{
	driver.findElement(txt_password_loc).sendKeys(pwd);
}
public void clicklogin()
{
	driver.findElement(loginbtn_loc).click();
}
}
//https://cucumber.github.io/cucumber-eclipse/update-site
