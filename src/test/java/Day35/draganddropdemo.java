package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropdemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		String title=driver.getTitle();
		
		if(title.equals("Drag and Drop Action"))
		{
			System.out.println("test pass");
			
		}
		else
		{
			System.out.println("test fail");
		}
		
	boolean status=	driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']")).isDisplayed();
System.out.println(status);

		Actions act=new Actions(driver);
		
		WebElement ruppes=	driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement amount=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));

		act.dragAndDrop(ruppes, amount).perform();
		
		Thread.sleep(3000);

		WebElement Bank=		driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement Account=		driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		act.dragAndDrop(Bank, Account).perform();
		//driver.close();

	}

}
