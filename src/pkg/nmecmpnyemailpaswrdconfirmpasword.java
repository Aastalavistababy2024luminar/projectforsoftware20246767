package pkg;

import java.sql.Driver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nmecmpnyemailpaswrdconfirmpasword {
ChromeDriver driver;

@Before
public void setup()
{
	driver =new ChromeDriver();
	driver.get("https://blazedemo.com/register");
}

@Test
public void test()
{
	driver.findElement(By.name("name")).sendKeys("rayan");
	driver.findElement(By.name("company")).sendKeys("lumi");
	driver.findElement(By.name("email")).sendKeys("lumi@gmail.com");
	driver.findElement(By.name("password")).sendKeys("1234");
	driver.findElement(By.name("password_confirmation")).sendKeys("1234");
	
	//driver.findElement(By.name("submit")).click();


}
}