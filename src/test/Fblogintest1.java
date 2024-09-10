package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FBlogin2024;

public class Fblogintest1 {
	WebDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeAll
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void testlogin() throws Exception
	{
		fblogin ob=new fblogin(driver);
		ob.setvalues("abc@gmail.com", "acbd");
		ob.login();
	}

}
