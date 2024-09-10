package testng;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop{
	
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://demoqa.com/droppable");
	}
	
	@Test
	public void test()
	{
		WebElement ab=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		
		WebElement nn=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(ab, nn);
		act.perform();
		
		String t=nn.getText();
		
		if(t.equals("Dropped!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("failed");
		}
	}

}