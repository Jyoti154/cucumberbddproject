package Day23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
//driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();

// tag.classname
//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("jyoti");

//tag#id
//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("jyoti");

//tag[attribute='value']
//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("jyoti");

//driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("jyoti");
// List <WebElement > links=driver.findElements(By.tagName("span"));
//System.out.println("total links: "+links.size());

//driver.findElement(By.linkText("Electronics")).click();
//driver.findElement(By.partialLinkText("Con")).click();
//List <WebElement> headerlink=driver.findElements(By.tagName("img"));
//System.out.println("total headerlinks:" +headerlink.size());

		List<WebElement> imges = driver.findElements(By.tagName("div"));
		System.out.println("total imge: " + imges.size());
//driver.close();

	}

}
