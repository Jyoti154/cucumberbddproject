package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException
	{
	driver=new ChromeDriver()	;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	
@Test(dataProvider="dp")
	void login(String username,String pwd) throws InterruptedException 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pwd");
		
		boolean status=	driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(status==true)
		{
			
			System.out.println("test pass");
			
		}
		else
		{
			System.out.println("test fail");
		}
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
	
	//driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		
		
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	@DataProvider(name="dp",indices={0,2,1,3})
	Object[][] logindata()
	{
		Object data[][]= {
				{"admin","admin12"},
				{"admiss","admin123"},
				{"Admin","admin123"},
				{"test","test123"},
				{"jyoti","jyoti12"},
				
				
				
				
		                   };
		return data;
	}
		
	}



