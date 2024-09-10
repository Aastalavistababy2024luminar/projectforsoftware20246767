package testng;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishiherbals {
	WebDriver driver;
	String baseurl="https://rishiherbalindia.linker.store/";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading() {
		driver.get(baseurl);
		
	}
	@Test
	public void test1() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("Pawanandhraa@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Rahul@2024");
		
		WebElement check=driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input"));
		if (!check.isSelected()) {
           
            check.click();
        }

        
        if (check.isSelected()) {
            System.out.println("Checkbox is successfully selected.");
        } else {
            System.out.println("Checkbox is not selected.");
        }
		
		
		
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
		
	    driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Rahul@2024");
	    driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
	    Thread.sleep(3000);
	    	       
	    
	    driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal Agro Growth Booster");
	    driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();
	    
          JavascriptExecutor js=(JavascriptExecutor) driver;
		
          js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")));
	    
	   
	    WebElement hover=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img"));	
		Actions act=new Actions(driver);
		act.moveToElement(hover).perform();
		
		
driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		
		WebElement hover2=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img"));	
		Actions act2=new Actions(driver);
		act2.moveToElement(hover2).perform();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
		
		
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/a[2]"));
		File src1=dayelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./screenShotAugust//Elementsscreenshot08.png"));
		
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200) {
			System.out.println("Valid url");
		}else {
			System.out.println("invalid url");
	}
	}
}
