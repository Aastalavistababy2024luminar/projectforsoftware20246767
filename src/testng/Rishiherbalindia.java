package testng;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;

import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Rishiherbalindia {
    private static final String FileUtils = null;

	public static void main(String[] args) {
        // Set the path of the WebDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Open the website
            driver.get("https://rishiherbalindia.linker.store/");

            // Step 2: Click My Account and register your details
            driver.findElement(By.linkText("M//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
            driver.findElement(By.linkText("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
            // Fill in registration details (example)
            
           
            driver.findElement(By.id("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("Shawnaloysious@gmail.com");
            driver.findElement(By.id("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Tutushawn123");
            driver.findElement(By.id("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
            driver.findElement(By.id("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
           
            // Step 3: Click login button and login
            driver.findElement(By.linkText("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")).click();
            driver.findElement(By.id("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("Shawnaloysious@gmail.com");
            driver.findElement(By.id("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Tutushawn123");
            driver.findElement(By.id("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();

            // Step 4: Search for Herbal Agro Growth Booster in Searchbar
            WebElement searchBox = driver.findElement(By.name("//*[@id=\"search\"]/input"));
            searchBox.sendKeys("Herbal Agro Growth Booster");
            searchBox.submit();

            // Step 5: Add to wishlist
            driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();

            // Step 6: Click on link skin & add aloe fairness cream to your wishlist
            driver.findElement(By.linkText("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[4]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
            driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();

            // Step 7: Click 'All' link. Then click 'Health' link. After that click 'safety' link.
            driver.findElement(By.linkText("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[1]/a")).click();
            driver.findElement(By.linkText("//*[@id=\"res-menu1\"]/div/div/a")).click();
            driver.findElement(By.linkText("//*[@id=\"res-menu1\"]/ul/li[2]/a")).click();
            driver.findElement(By.linkText("//*[@id=\"res-menu1\"]/div/div"));
            driver.findElement(By.linkText("//*[@id=\"res-menu1\"]/ul/li[3]/a")).click();

            // Step 8: Scroll to the bottom of the page and click 'About us'
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            driver.findElement(By.linkText("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();

            // Step 9: Take screenshot of the element 'privacy policy'
            WebElement privacyPolicy = driver.findElement(By.linkText("//*[@id=\"column-left\"]/div[1]/div[2]/a[2]"));
            File screenshot = ((TakesScreenshot) privacyPolicy).getScreenshotAs(OutputType.FILE);
            

            // Step 10: Check the response code of the link
            String linkUrl = "https://rishiherbalindia.linker.store/";
            HttpURLConnection connection = (HttpURLConnection) new URL(linkUrl).openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            System.out.println("Response code of the link is: " + responseCode);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        finally {
            // Close the browser
           // driver.quit();
        }
    }
}