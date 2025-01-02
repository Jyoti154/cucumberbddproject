package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {

	public static void main(String[] args) {
ChromeOptions options=new ChromeOptions();
options.setAcceptInsecureCerts(true);//accept ssl cetificate


WebDriver driver=new ChromeDriver(options);
driver.get("https://expired.badssl.com/");
System.out.println("title of the page:"+driver.getTitle());// title of the page:Privacy error
                                                   //   after using ssl title of the page:expired.badssl.com

	}

}
