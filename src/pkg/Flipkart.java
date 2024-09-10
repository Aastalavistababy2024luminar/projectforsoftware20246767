package pkg;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Flipkart {
     ChromeDriver driver;
     
     @Before
     public void setup()
     {
    	 driver=new ChromeDriver ();
    	 driver.get("https://www.flipkart.com");
    	 //System.out.println("browser open");
     }
     @Test
     public void test()
     {
    	 String acttitle=driver.getTitle();
    	 System.out.println(acttitle);
    	 String exp="Flipkart";
    	 if(acttitle.equals(exp))
    	 {
    		 System.out.println("pass");
    	 }
    	 else
    	 {
    		 System.out.println("fail");
    	 }
    	 //System.out.println("test activity");
     }
     @Test
     public void test1()
     {
    	 String src=driver.getPageSource();
    	 if(src.contains("Gmail"))
    	 {
    		 System.out.println("pass");
    	 }
    	 else
    	 {
    		 System.out.println("fail");
    	 }
     }
     @After
     public void browserclose()
     {
    	 driver.close();
     }
}