package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictable {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
int rows	=	driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println("total rows"+rows);
	
int header=	driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
System.out.println("total header:"+header);

int totalheader=driver.findElements(By.tagName("th")).size();
System.out.println("total headers:"+totalheader);

String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
System.out.println(bookname);


/*for(int r=2;r<=rows;r++)
{
	for(int c=1;c<=header;c++)
	{
String value=		driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
System.out.println(value+ "/t");
	}
	System.out.println();
}

for(int r=2;r<=rows;r++)
{
String name=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
if(name.equals("mukesh"));
{
String name1=driver.findElement(By.xpath("//table[@name='BookTable']//tr[\"+r+\"]//td[1]")).getText();
System.out.println(name1+"\t"+name);


	}

}*/
int total=0;
for(int r=2;r<=rows;r++)
{
String price=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
total=total+Integer.parseInt(price);
	
}
System.out.println("total price:"+total);//7100

	}
}
