package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdrpractice {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	WebElement op=	driver.findElement(By.xpath("//select[@id='country-list']"));
	Select list=new Select(op);

//list.selectByVisibleText("Brazil");
	//list.selectByValue("2");
	//list.selectByIndex(3);
	
List<WebElement>	option=list.getOptions();
System.out.println("total options:"+option.size());


for(WebElement el:option)
{
	System.out.println(el.getText());
}







driver.close();
		
	}

}
