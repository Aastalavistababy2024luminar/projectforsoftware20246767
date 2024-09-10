package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class dob {
	ChromeDriver driver;
		@Before
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
     @Test
     public void scrensot() throws Throwable 
     {
    	 /* File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src,new File("D://error7.png"));*/
    	 
    	 WebElement dayelement1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
    	 WebElement dayelement2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
    	 driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
 		File src1=dayelement1.getScreenshotAs(OutputType.FILE);
 		FileHandler.copy(src1, new File("./screenshotAugust//Elementscreenshot4.png"));
 		dayelement2.getScreenshotAs(OutputType.FILE);
 		FileHandler.copy(src1, new File("./screenshotAugust//Elementscreenshot4.png"));
     }
}

