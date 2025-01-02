package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();

//min slider

driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
WebElement Min_Slider=driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
System.out.println("Default location :"+Min_Slider.getLocation());

Actions act =new Actions(driver);
act.dragAndDropBy(Min_Slider, 57, 249).perform();
System.out.println("After moving location :"+Min_Slider.getLocation());

//max slider
//WebElement Max_Slider=driver.findElement(By.xpath("//span[2]"));
WebElement Max_Slider=driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));
//Thread.sleep(3000);
System.out.println("Max slider location:"+Max_Slider.getLocation());//(510, 289)
act.dragAndDropBy(Max_Slider, -300, 289).perform();
System.out.println("After moving location"+Max_Slider.getLocation());




//Thread.sleep(3000);
//driver.close();

	}

}
