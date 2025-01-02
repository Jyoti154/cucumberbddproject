package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");	
	
	
	
WebElement rome=	driver.findElement(By.xpath("//div[@id='box6']"));
WebElement itely=driver.findElement(By.xpath("//div[@id='box106']"));

Actions act=new Actions(driver);

act.dragAndDrop(rome, itely).perform();



WebElement spain=driver.findElement(By.xpath("//div[@id='box107']"));
WebElement oslo=driver.findElement(By.xpath("//div[@id='box1']"));
act.dragAndDrop(spain, oslo).perform();

//driver.close();
	}

}
