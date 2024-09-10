package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class onedrive {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/Downloads/fucntion.html");
	}
	
	@Test
	public void Buttonverify()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().accept();
	Alert a=driver.switchTo().alert();
		String text=a.getText();
		if(text.equals("hello i am"))
	{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
	}
}

