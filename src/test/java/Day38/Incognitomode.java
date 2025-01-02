package Day38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognitomode {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");//setting for incognito mode of exection

		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/");
	String act_title=	driver.getTitle();
if(act_title.equals("nopCommerce demo store"))
{
	System.out.println("test pass");
}
else
{
	System.out.println("test fail");
}
driver.quit();

	}

}
