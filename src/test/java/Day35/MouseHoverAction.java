package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=11405619736505418533&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062095&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
	WebElement all=	driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
	WebElement hmenu=	driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']//a[@class='hmenu-item'][normalize-space()='New Releases']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(all).moveToElement(hmenu).click().build().perform();
		

	}

}
