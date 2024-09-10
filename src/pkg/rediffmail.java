package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffmail {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details.com/");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("kbzz");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input")).sendKeys("kbzz@gmail.com");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("kbzzzzz");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("kbzzzzz");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[15]/td[3]/input")).sendKeys("kbzz");

	}
	}