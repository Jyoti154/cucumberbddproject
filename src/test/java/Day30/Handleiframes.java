package Day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleiframes {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
	WebElement frame1=	driver.findElement(By.xpath("//*[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello");
	driver.switchTo().defaultContent();

	WebElement frame2=	driver.findElement(By.xpath("//*[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
	driver.switchTo().defaultContent();

	WebElement frame4=	driver.findElement(By.xpath("//*[@src='frame_4.html']"));
	driver.switchTo().frame(frame4);
	driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Java");
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	WebElement frame3=	driver.findElement(By.xpath("//*[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("C#");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();
	driver.findElement(By.xpath("//div[@id='i27']//div[@class='uHMk6b fsHoPb']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("very easy");
	driver.findElement(By.xpath("//textarea[@aria-label='Your answer']")).sendKeys("i am jyoti bagal is very good girl");
	driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
	driver.switchTo().defaultContent();
	
	
	}

}
