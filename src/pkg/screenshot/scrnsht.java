package pkg.screenshot;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.io.FileHandler;

public class scrnsht {

    ChromeDriver driver;

    @Before
    public void setUp() {
        // Specify the path to the chromedriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
    }

    @Test
    public void takeElementScreenshot() throws Exception {
        // Find the web element using its XPath
        WebElement dayElement = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
        
        // Capture the screenshot of the specific element
        File srcFile = dayElement.getScreenshotAs(OutputType.FILE);
        
        // Specify the destination where the screenshot will be saved
        File destFile = new File("./screenshotAugust/ElementScreenshot.png");
        
        // Copy the screenshot to the specified location
        FileHandler.copy(srcFile, destFile);
    }

    @After
    public void tearDown() {
        // Close the browser after the test
        if (driver != null) {
            driver.quit();
        }
    }
}