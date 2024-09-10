package pkg.screenshot;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class createmyaccountscreenshot {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void screnshot() throws IOException {
		        
		
		
		
		           /* File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileHandler.copy(src,new File("D://error7.png"));*/
		
		WebElement dayelement=driver.findElement(By.xpath("//*//*[@id=\"Register\"]"));
		File src1=dayelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./screenshotAugust//Elementscreenshot2.png"));
	}
}

      

	
	