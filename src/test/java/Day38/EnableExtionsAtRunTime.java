package Day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class EnableExtionsAtRunTime {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		File file=new File("C:\\Users\\bagal\\Downloads\\Batch.crx");
		options.addExtensions(file);
		
		WebDriver driver=new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/");
	
	}

}