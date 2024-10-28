package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerAutomationforFlightBookingtestcasestestng {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.etihad.com");
    }

    @Test
    public void selectFlightDate() {
        driver.findElement(By.id("date-picker")).click();  // Replace with actual date picker ID
        driver.findElement(By.xpath("//button[@aria-label='Select October 25, 2023']")).click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
