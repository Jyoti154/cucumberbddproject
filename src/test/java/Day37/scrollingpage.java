package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class scrollingpage {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
JavascriptExecutor js=(JavascriptExecutor)driver;

//secrolldown page using javascriptexecutor
js.executeScript("window.scrollBy(0,1000)", "");
System.out.println(js.executeScript("return window.pageYOffset;"));


//scroll the page till element the view
/*WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Your Password']"));
js.executeScript("arguments[0].scrollIntoView()", ele);
System.out.println(js.executeScript("return window.pageYOffset;"));
*/


//scroll page till end of the page

js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
System.out.println(js.executeScript("return window.pageYOffset;"));

Thread.sleep(5000);

//scrolling up to initial position
js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");





















	}

}
