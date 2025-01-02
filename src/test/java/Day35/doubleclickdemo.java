package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickdemo {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

driver.switchTo().frame("iframeResult");

WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
WebElement copytext=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
box1.clear();
box1.sendKeys("jyoti mane");

Actions act=new Actions(driver);
act.doubleClick(copytext).perform();

String text=box2.getAttribute("value");
if(text.equals("jyoti mane"))
{
	System.out.println("this is test pass?"+text);
}
else
{
	System.out.println("test fail");
}

	}

}
