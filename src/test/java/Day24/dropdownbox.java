package Day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownbox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		/*
		 * WebElement element=driver.findElement(By.id("course"));
		 * 
		 * Select sl=new Select(element); //sl.selectByVisibleText("Javascript");
		 * //sl.deselectByIndex(2); //sl.selectByValue("2"); if(sl.isMultiple()) {
		 * System.out.println("dropdown is multiple"); } else {
		 * System.out.println("dropdown is not multiple"); }
		 * 
		 * 
		 * List<WebElement>totaloptions=sl.getOptions();
		 * System.out.println(totaloptions.size()); for(WebElement options:totaloptions)
		 * { System.out.println(options.getText()); }
		 */

		WebElement element = driver.findElement(By.id("course"));

		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Java");

		List<WebElement> option = dropdown.getOptions();
		System.out.println(option.size());
		for (WebElement totaloption : option) {
			System.out.println(totaloption.getText());
		}

	}

}
