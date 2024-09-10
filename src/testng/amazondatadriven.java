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

public class amazondatadriven {
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
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void main() throws IOException
	{
		File f=new File ("D:\\Amazon.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username =" + username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(pswd);

			//driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div[1]/div/div/div[2]/div/div[2]/a")).click();
			//driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div[1]/div/div/div[1]/img")).sendKeys("//*[@id=\"captchacharacters\"]");
			//driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div[2]/div/span/span/button")).click();
			
			driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(pswd);
			driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[2]/div/form/div/div[2]/div/div/label/div/label/input")).click();
			driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"cvf-page-content\"]/div/div/div/form/div[4]/div/a[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"cvf-page-content\"]/div/div/div/div[2]/div/img")).sendKeys("//*[@id=\"cvf-page-content\"]/div/div/div/form/div[2]/input");
			driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]/span/input")).click();
			driver.navigate().refresh();
			String actualurl=driver.getCurrentUrl();
			System.out.println(actualurl);
			//String expurl="https://www.amazon.in/";
		}
	}

}
