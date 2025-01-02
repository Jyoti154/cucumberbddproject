package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplictwait {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //declartion
driver.get("https://the-internet.herokuapp.com/javascript_alerts");

driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
Thread.sleep(5000);

Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
System.out.println(myalert.getText());
myalert.accept();


	}

}
