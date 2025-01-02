package Day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxPractice {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
	List <WebElement> checkbox=driver.findElements(By.xpath("//*[@type='checkbox' ]"));
	/*for(int i=0;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	}
*/
	for(int i=5;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	}

	}

}
