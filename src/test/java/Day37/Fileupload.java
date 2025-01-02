package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		// single file upload
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\TextData\\pune.txt");
		if(driver.findElement(By.xpath("//li[normalize-space()='pune.txt']")).getText().equals("pune.txt"))
				{
			System.out.println("file is succfull upload");
				}
		else
		{
			System.out.println("file is not upload");
		}*/
		
		// multiple file upload
		String file1="C:\\TestData2\\pune.txt";
		String file2="C:\\TestData2\\pandharpur.txt";
		String file3="C:\\SQL2022\\Dev_filelist_ENU.snp";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2+"\n"+file3);
		
		
		//number of file
	int totalfile=	driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	if(totalfile==3)
	{
		System.out.println("all files are upload");
		
	}
	else
	{
		System.out.println("all fill not upload");
	}
	//validate name of files
	
	if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("pune.txt")
			&&driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("pandharpur.txt")
			&&driver.findElement(By.xpath("//ul[@id='fileList']//li[3]")).getText().equals("Dev_filelist_ENU.snp"))
			{
		System.out.println("file name is matching");
			}
	else
	{
		System.out.println("file is not matching");
	}
	}

}
