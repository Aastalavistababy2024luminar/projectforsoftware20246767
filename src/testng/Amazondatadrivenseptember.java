package testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazondatadrivenseptember {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading() {
		driver.get("https://www.amazon.in/");
		
	}
	@Test
	public void test1() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile Phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		//driver.manage().window().maximize();
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String exp="Amazon.in : Mobile Phones";
		if(actualtitle.equals(exp)) { 
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		
    	
	
		 Set<String> allWindows = driver.getWindowHandles();
		 for (String a : allWindows) {
	            if (!a.equalsIgnoreCase(parentWindow)) {
	            	driver.switchTo().window(a);
	            	
	            	Thread.sleep(3000);
	            	JavascriptExecutor js=(JavascriptExecutor) driver;
	        		
	        		js.executeScript("window.scrollBy(0,700)", "");
	            	
				driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				driver.close();
			}
	            driver.switchTo().window(parentWindow);
		}
	}

}

