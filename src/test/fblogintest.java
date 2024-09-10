package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runners.Parameterized.BeforeParam;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogintest {
	WebDriver driver;
	@BeforeParam
	public void setUp()
	{
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//driver=new ChromeDriver(options);
		driver=new ChromeDriver();
	}
	@BeforeEach
	public void url()
	{
	 driver.get("https://www.facebook.com/");	
	}
	
	@Test
	public void testlogin()
	{
		fblogin ob=new fblogin(driver);
		ob.setvalues("abc@gmail.com", "acbd");
		ob.login();
		
		//Thread.sleep(1000);
		//driver.navigate().back();
		/* Passworderrorpage ob1=new Passworderrorpage(driver);
		  ob1.linkclick();
		 */
	}


}
