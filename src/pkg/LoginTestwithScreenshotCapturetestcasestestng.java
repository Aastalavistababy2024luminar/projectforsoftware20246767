package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ScreenshotUtil;

public class LoginTestwithScreenshotCapturetestcasestestng {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.etihad.com");
    }

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser@example.com", "password123");

        ScreenshotUtil.captureScreenshot(driver, "EtihadLoginPageAfterSubmit");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
