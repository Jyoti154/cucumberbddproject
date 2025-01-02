package Day36;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndNewWindow {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
		
	driver.switchTo().newWindow(WindowType.TAB);//open new tab
	//	driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://text-compare.com/");

	}

}
