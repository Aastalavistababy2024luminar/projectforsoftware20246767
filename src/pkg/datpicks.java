package pkg;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class datpicks {
	WebDriver driver;
	//String baseur1="https://www.trivago.com";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		//driver.get(baseur1);
		driver.get("https://www.trivago.com");
		driver.manage().window().maximize();
	}
	@Test
	public void testlogin()
	{
		driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[1]/div/button[32]/time")).click();
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[1]/h3"));
			String month1=month.getText();
			if(month1.equalsIgnoreCase("August 2024"))
			{
				System.out.println(month);
				break;
			}
			else
			{
				driver.findElement(By.xpath(""));
			}
		}
		
		
	}
	

}
