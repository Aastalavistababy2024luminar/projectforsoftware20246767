package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptalerts {

	
	ChromeDriver driver;


		@Before
    public void setup()
    {
    	driver = new ChromeDriver();
    	//driver.get("https://demoqa.com/alerts");
    	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }
    @Test
    public void test()
    {
    	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"  )).click();
    	driver.switchTo().alert().accept();
    	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
    	driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        //first approach to handle prompt alert
        Alert a=driver.switchTo().alert();
        a.sendKeys("abc");
        a.accept();
        //2nd approach
        //Alert pro=driver.switchTo().alert();
        //pro.sendkeys("fhjgh");
        //pro.accept();
	}
}



