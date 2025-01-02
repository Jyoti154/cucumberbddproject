package Day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

//System.out.println(driver.getPageSource());

		String windoid = driver.getWindowHandle();
		System.out.println("windoids" + windoid);

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);
//driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]"));
		Set<String> windoids = driver.getWindowHandles();
		System.out.println("total windo id:" + windoids);
	}

}
