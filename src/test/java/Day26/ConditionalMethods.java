package Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);

		System.out.println(driver.getTitle());

		boolean enablename = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("name is enable?" + enablename);

		boolean checkbox = driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
		System.out.println(checkbox);

		boolean search = driver.findElement(By.xpath("//button[normalize-space()='Search']")).isDisplayed();
		System.out.println("searchbox" + search);

		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));

		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("before select...........");
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());

		System.out.println("After select male................");
		male.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());

		System.out.println("after select femaile.........");
		female.click();
		System.out.println(female.isSelected());
		System.out.println(male.isSelected());

		boolean newsselect = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("newsselect status" + newsselect);
		Thread.sleep(5000);

		driver.findElement(By.xpath("a[href='https://www.nopcommerce.com/']")).click();

		driver.quit();
	}

}
