package Day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();



	//driver.findElement(By.xpath("//input[@id='sunday']")).click();


List<WebElement>checkbox=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
/*
 // click all checkbox
  * 
for(int i=0;i<checkbox.size();i++)
{
	checkbox.get(i).click();
}
using inhanceforloop click all checkbox
for(WebElement cb:checkbox)
{
	cb.click();
}


//click last 4 checkbox
for(int i=3;i<checkbox.size();i++)
{
	checkbox.get(i).click();
}

*/
// click 1st 3 checkbox
 
for(int i=0;i<5;i++)
{
	checkbox.get(i).click();
}

Thread.sleep(5000);
for(int i=0;i<checkbox.size();i++)
{
	if(checkbox.get(i).isSelected())
	{
	checkbox.get(i).click();
}

}
	}

}
