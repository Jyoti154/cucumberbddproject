package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {


WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://text-compare.com/");

driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to Automation Testing");

Actions act=new Actions(driver);

//ctrl A
act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

//ctrl C
act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();


//Tab
act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

//ctel V

act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();



	}

}
