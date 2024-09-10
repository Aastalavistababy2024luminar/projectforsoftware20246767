package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saucedemodatadrivenseptember {
WebDriver driver;
	
	@BeforeTest
	public void set() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloaing() {
		driver.get("https://www.saucedemo.com/v1/");
	}
	
	@Test
	public void test1() throws Exception {
		File f=new File("D:\\Saucedemo.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh= wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1; i<=sh.getLastRowNum();i++) {
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username= " + username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password= "+ password);
			
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();	
			String actualtitle=driver.getTitle();
			System.out.println(actualtitle);
			String exp="Swag Labs";			
			if(actualtitle.equals(exp)) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}	}
}            }

