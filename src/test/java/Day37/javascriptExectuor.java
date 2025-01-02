package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExectuor {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
//ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://testautomationpractice.blogspot.com/");
//sendkeys method using javascriptexecutor
WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
WebElement email=driver.findElement(By.xpath("//input[@id='email']"));

//click method using javascriptexecutor
WebElement rediobtn=driver.findElement(By.xpath("//input[@id='female']"));



JavascriptExecutor js= (JavascriptExecutor) driver;
//javascriptExectuor js=driver();  use for chromedriver driver=new chromedriver;
js.executeScript("arguments[0].setAttribute('value','jyoti')",inputbox );
js.executeScript("arguments[0].setAttribute('value','mane')", email);
js.executeScript("arguments[0].click()", rediobtn);


//driver.close();


	}

}
