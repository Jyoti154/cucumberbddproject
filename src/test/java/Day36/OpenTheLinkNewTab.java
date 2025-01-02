package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkNewTab {

	public static void main(String[] args) throws InterruptedException {


WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
WebElement ragister=driver.findElement(By.xpath("//a[normalize-space()='Register']"));

Actions act=new Actions(driver);
//ctrl+register
act.keyDown(Keys.CONTROL).click(ragister).keyUp(Keys.CONTROL).perform();

//switch to ragister page
List<String>ids=new ArrayList(driver.getWindowHandles());
driver.switchTo().window(ids.get(1));
driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Amol");

//Home Page
driver.switchTo().window(ids.get(0));
driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("jadhav");

//click search button
driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
Thread.sleep(3000);
driver.quit();


	}

}
