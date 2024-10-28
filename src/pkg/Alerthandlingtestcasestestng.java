package pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerthandlingtestcasestestng {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.etihad.com");
    }

    @Test
    public void handleAlertIfPresent() {
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert Text: " + alert.getText());
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert present.");
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}