package Day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
driver.manage().window().maximize();
// 1 normal alert

/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
Thread.sleep(5000);

Alert myalert=driver.switchTo().alert();

System.out.println(myalert.getText());
myalert.accept();


// 2 alert with ok&cancel

driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
Thread.sleep(3000);

Alert myalert =driver.switchTo().alert();

System.out.println(myalert.getText());

myalert.accept();

// 3 promt alert-input box
 


driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
 Alert myalert=driver.switchTo().alert();
 System.out.println(myalert.getText());
 myalert.sendKeys("welcome to selenium");
 myalert.accept();
 */

	}

}
