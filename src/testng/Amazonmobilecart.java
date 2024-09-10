package testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazonmobilecart {
WebDriver driver;

@BeforeMethod
public void url() {
	driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
}
@Test
public void test1() {
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	
	 String title = driver.getTitle();
	 if (title.equalsIgnoreCase("amazon")) {
	 System.out.println("pass");
	 }
	 else { System.out.println("fail");}
	
	
	 String mainWindow = driver.getWindowHandle();
     Set<String> allWindows = driver.getWindowHandles();
     for (String window : allWindows) {
         if (!window.equals(mainWindow)) {
             driver.switchTo().window(window);   
             WebDriverWait cast=new WebDriverWait(driver,Duration.ofSeconds(30));
             cast.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"add-to-cart-button\\\"]")));
             driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click(); 
             cast.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sw-gtc\"]/span/a")));
             driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click(); 
             driver.close();
            driver.switchTo().window(mainWindow);
             

         
 
 }
}
}
}