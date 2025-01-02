package Day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
	List<WebElement> hyperlink=	driver.findElements(By.tagName("a"));
	int rescode=200;//valid responce
	int brokenlinkcount=0;
	
	System.out.println("total link on page"+hyperlink.size());
for(WebElement element:hyperlink)
{
	String url=element.getAttribute("href");

try {
	
	URL urllink=new URL(url);
	
	HttpURLConnection huc=(HttpURLConnection)urllink.openConnection();
	huc.setRequestMethod("HEAD");
	huc.connect();
	rescode=huc.getResponseCode();
	if(rescode>=400)
	{
		System.out.println(url+ "broken link");
		brokenlinkcount++;
	}
	else
	{
		System.out.println(url+"not broken link");
	}
	
}
catch(MalformedURLException e)
{
	
}
catch(Exception e)
{
	
}
System.out.println("total broken links:"+brokenlinkcount);
}
	}
}
