package Day37;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		Thread.sleep(5000);
		//driver.manage().window().minimize();
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");//set zoom level 50%
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='80%'");//set zoom level 80%
		Thread.sleep(5000);
		
	}

}
