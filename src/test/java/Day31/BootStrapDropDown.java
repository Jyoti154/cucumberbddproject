package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();

// click singal emement
//driver.findElement(By.xpath("//input[@value='csharp']")).click();

//capture all the option and find out size

List <WebElement>option= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
System.out.println(option.size());

/*for(WebElement el:option)
{
	System.out.println(el.getText());
}

// select multipal option
for(WebElement el:option)
{
	String options=el.getText();
	if(options.equals("Java")|| options.equals("Python"))

{
	el.click();
	
	Thread.sleep(5000);
	
	
}*/



	

	}
}