package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullpageScreenShots {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

driver.get("https://demo.nopcommerce.com/");

// 1.full page screenshot

/*TakesScreenshot ts=(TakesScreenshot)driver;
File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//C:\35-automation-batch\seleniumwebdriver\screenshots    ---> actual path
File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
sourcefile.renameTo(targetfile);//copy sourcefile to target file

*/

// 2.specific screenshot area of the page

/*WebElement Featureprodect=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='item-grid']"));
File sourcefile=Featureprodect.getScreenshotAs(OutputType.FILE);
File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\productfeature.png");
sourcefile.renameTo(targetfile);//copy sourcefile to target file
*/

//3 webelement screenshot

WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
File sourcefile=logo.getScreenshotAs(OutputType.FILE);
File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
sourcefile.renameTo(targetfile);//copy sourcefile to target file
	}

}
