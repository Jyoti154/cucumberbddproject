package Day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total links:" + links.size());

		for (WebElement el : links) {
			System.out.println(el.getText());
		}
		driver.close();

	}

}
