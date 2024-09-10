package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class headingmarkradiobutton {
	ChromeDriver driver;
	@Before
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement create=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		  boolean s=create.isDisplayed();
		if(s)
		{
			System.out.println("The logo is present");
		}
		else
		{
			System.out.println("The logo is not present");
		}
		
		WebElement created=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		  boolean si=create.isSelected();
		if(si)
		{
			System.out.println("The box is selected");
		}
		else
		{
			System.out.println("The box is not selected");
		}
		
		WebElement createdd=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]"));
		  boolean sii=create.isSelected();
		if(sii)
		{
			System.out.println("The radio button is selected");
		}
		else
		{
			System.out.println("The radio button is not selected");
		}
		
	}

}