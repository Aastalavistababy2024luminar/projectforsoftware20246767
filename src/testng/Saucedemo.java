package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saucedemo {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins-*");
		//driver=new ChromeDriver(options);
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading() {
		driver.get("https://www.saucedemo.com/v1/");
	}
	@Test
	public void main() throws IOException
	{
		File f=new File ("D:\\Saucedemo.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		for(int i = 1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username =" + username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(pswd);
			
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswd);
			driver.findElement(By.name("//*[@id=\"login-button\"]")).click();
			
			driver.navigate().refresh();
			String actualurl=driver.getCurrentUrl();
			System.out.println(actualurl);
			//String expurl="https://www.saucedemo.com/v1/";
			
		}
	}

}
