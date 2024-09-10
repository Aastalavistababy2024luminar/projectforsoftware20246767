package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fblogin {
	WebDriver driver;//null
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	public  fblogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password)
	{
		//driver.navigate().refresh();
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
		
	}
	public void login() {
		// TODO Auto-generated method stub
		
	}
	
}
