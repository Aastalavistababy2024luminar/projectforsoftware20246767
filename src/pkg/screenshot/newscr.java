package pkg.screenshot;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newscr {
	ChromeDriver driver;
	
	
	@Before
public void set()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}
	


@Test
public void buttontextverify()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
    String buttontext=button.getAttribute("value");
    if(buttontext.equals("Create my account>>"))
    {
    	System.out.println("pass");
    }
    else
    {
    	System.out.println("fail");
    }
}
}
