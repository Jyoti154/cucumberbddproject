package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();
		// driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']"));

		List<WebElement> totallink = driver.findElements(By.tagName("a"));
		System.out.println("total search links:" + totallink.size());

		Set<String> windoid = driver.getWindowHandles();
		/*
		 * List<String>windoidlist=new ArrayList(windoid);
		 * 
		 * 
		 * String parentid=windoidlist.get(0); String child=windoidlist.get(1); String
		 * child1=windoidlist.get(2);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.switchTo().window(parentid); System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(child); System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(child1); System.out.println(driver.getTitle());
		 * 
		 * 
		 * 
		 * /*String child1=windoidlist.get(2);
		 * 
		 * 
		 * driver.switchTo().window(child); System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(child1); System.out.println(driver.getTitle());
		 */

		/*
		 * print all title in browser
		 * 
		 * for(String xyz:windoid) { String title=
		 * driver.switchTo().window(xyz).getTitle(); System.out.println(title);
		 * 
		 * // close specific browser
		 * if(title.equals("Selenium dioxide - Wikipedia")||title.
		 * equals("Automation Testing Practice")) { driver.close(); }
		 * 
		 * }
		 */

//print only one title

		for (String xyz : windoid) {
			String title = driver.switchTo().window(xyz).getTitle();
			if (title.equals("Selenium dioxide - Wikipedia")) {
				System.out.println(driver.getCurrentUrl());
			}

		}
	}

}
