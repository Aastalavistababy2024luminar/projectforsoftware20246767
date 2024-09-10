package testng;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mobilecart2024 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Initialize EdgeDriver
        driver = new EdgeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    }

    @Test
    public void testAddToCart() {
        // Search for mobile phones
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones");
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Click on the third item in the search results
        driver.findElement(By.xpath("//div[@data-index='2']//h2/a")).click();
        
        // Handle multiple windows
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                
                // Wait for the Add to Cart button and click it
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
                driver.findElement(By.id("add-to-cart-button")).click();

                // Wait for Go to Cart button and click it
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'cart')]")));
                driver.findElement(By.xpath("//a[contains(@href, 'cart')]")).click();

                // Close the newly opened window
                driver.close();
            }
        }

        // Switch back to the main window
        driver.switchTo().window(mainWindow);

        // Validate if the page title contains 'Amazon'
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("amazon"), "Page title validation failed!");
    }
}