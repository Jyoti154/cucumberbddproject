package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

driver.get("https://testautomationpractice.blogspot.com/");
WebElement dropdowncountry=driver.findElement(By.xpath("//select[@id='country']"));
Select country=new Select(dropdowncountry);
//country.selectByVisibleText("United Kingdom");
//country.selectByValue("india");
country.selectByIndex(2);


List<WebElement> options=country.getOptions();
System.out.println("total number of options:"+options.size());

for(int i=0;i<options.size();i++)
{
	System.out.println(options.get(i).getText());
}

for(WebElement el:options)
{
	System.out.println(el.getText());
}

	}

}
