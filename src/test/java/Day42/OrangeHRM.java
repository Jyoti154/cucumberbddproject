package Day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
  @Test(priority=1)
  public void openapp() 
  {
 driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.manage().window().maximize();
 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

  }
  
  @Test(priority=2)
  public void testlogo() throws InterruptedException
  {
	  Thread.sleep(5000);
	boolean status=  driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println("logo is display: "+status);
  }
  @Test(priority=3)
  public void login() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  }
  
  @Test(priority=4)
  public void closeapp()
  {
	  driver.quit();
  }
}