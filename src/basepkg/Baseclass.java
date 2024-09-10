package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
  public WebDriver driver;
  
  @BeforeTest
  public void setUp()
  {
    //ChromeOptions=new ChromeOptions();
    //options.addArguments("--remote-allow-orgins=*);
    //driver=new ChromeDriver(options);
    driver=new ChromeDriver();
  
  
        
  }
  @BeforeTest
  public void url()
  {
    driver.get("https://www.facebook.com/");
  }
  

}
