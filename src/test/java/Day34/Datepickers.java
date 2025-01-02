package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickers {

	public static void main(String[] args) throws InterruptedException {



		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
String dates="17";
String month="April";
String year="2023";


driver.get("https://jqueryui.com/datepicker/");
driver.switchTo().frame(0);
WebElement date=driver.findElement(By.id("datepicker"));
date.click();

//select month and year
while(true)
{
String calender_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
String calenderyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

if(calender_month.equals(month)&&calenderyear.equals(year))
{

	break;
}



	//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next
driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //previous
}
	
// select date

List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
for(WebElement el:alldates)
{
	if(el.getText().equals(dates))
	{
	el.click();
	break;
}

	}
	
	}
}
