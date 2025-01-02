package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement rightclick=	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
Actions act=new Actions(driver);
act.contextClick(rightclick).perform();
Thread.sleep(3000);

driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-cut']")).click();
Thread.sleep(3000);

driver.switchTo().alert().accept();



driver.close();
	}

}
