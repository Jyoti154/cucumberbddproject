package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehoverdemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		driver.get("https://demo.opencart.com/");
		WebElement desktop=		driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Actions act=new Actions(driver);
		act.moveToElement(desktop).moveToElement(mac).click();

	}

}
