package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoitpgm {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void pdf() throws IOException {
		driver.findElement(By.xpath("//*[@id='pickfiles']/span")).click();
		Runtime.getRuntime().exec("D:\\AutoIt v3 Script");
	}

}
