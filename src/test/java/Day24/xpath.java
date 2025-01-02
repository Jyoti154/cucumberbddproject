package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("jyoti");

//driver.findElement(By.xpath("//input[@id='small-searchterms'][@name='q']")).sendKeys("mane");

//driver.findElement(By.xpath("//input[@id='small-searchterms'and@type='text']")).sendKeys("jyoti");

//driver.findElement(By.xpath("//input[@id='small-searchterms'or@type='tt']")).sendKeys("tshirt");

driver.findElement(By.xpath("//*[text()='Log in']")).click();

//boolean displaystatus=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
//System.out.println(displaystatus);

//String value=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
//System.out.println(value);

//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("jyoti");
//driver.findElement(By.xpath("//button[@type='submit']")).click();

	//	driver.get("https://www.saucedemo.com/");
//driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//driver.findElement(By.xpath("//input[(contains(@id,'user-name'))]")).sendKeys("standard_user");
	//	driver.findElement(By.xpath("//input[(starts-with(@id,'user-name'))]")).sendKeys("standard_user");
		//driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//input[@name='login-button']")).click();

		//String display = driver.findElement(By.xpath("//*[text()='Accepted usernames are:']")).getText();
		//System.out.println("display");

//String currentwindowhandle=driver.getWindowHandle();
//System.out.println(currentwindowhandle);

//driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack'and@name='add-to-cart-sauce-labs-backpack']")).click();
//driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light'or@name='add-to-cart-sauce-labs-bike-lig']")).click();
	}

}
