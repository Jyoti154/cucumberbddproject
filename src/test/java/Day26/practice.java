package Day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		System.out.println(driver.getWindowHandle());

		Set<String> windoid = driver.getWindowHandles();
		System.out.println("windoid:" + windoid);

		String text = driver.findElement(By.xpath("//span[text()='For Selenium, Cypress & Playwright']")).getText();

		System.out.println(text);

		boolean logo = driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']")).isDisplayed();

		System.out.println(logo);

		String text1 = driver.findElement(By.xpath("//h2[normalize-space()='Tabs']")).getText();

		System.out.println(text1);

		WebElement mmaleclick = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='female']"));

		System.out.println("before select...........");
		System.out.println(mmaleclick.isSelected());
		System.out.println(female.isSelected());

		Thread.sleep(5000);

		System.out.println("after select male...............");
		mmaleclick.click();
		System.out.println(mmaleclick.isSelected());
		System.out.println(female.isSelected());

		System.out.println("after select female...........");
		female.click();
		System.out.println(mmaleclick.isSelected());
		System.out.println(female.isSelected());

		boolean sunday = driver.findElement(By.xpath("//input[@id='sunday']")).isEnabled();
		System.out.println("sunday is enable?:" + sunday);

		driver.close();
	}

}
