package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class firsttestcase {

	public static void main(String[] args) {

//ChromeDriver driver=new ChromeDriver();
		WebDriver driver = new ChromeDriver();

		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		/*String act_title = driver.getTitle();
		if (act_title.equals("OrangeHRM")) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}*/
		//driver.close();

	}

}
