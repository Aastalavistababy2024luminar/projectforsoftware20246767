package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonassignmentin {
    public static void main(String[] args) {
    	// Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "C:/path/to/chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open Amazon.in
            driver.get("https://www.amazon.in"); 

            // Enter a mobile in the search field
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("mobile");
            searchBox.submit();

            // Click the cart
            WebElement cart = driver.findElement(By.id("nav-cart"));
            cart.click();

            // Click Hello Sign In
            WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
            signIn.click();

            // Enter an invalid ID and click continue
            WebElement emailField = driver.findElement(By.id("ap_email"));
            emailField.sendKeys("invalid@example.com");
            WebElement continueButton = driver.findElement(By.id("continue"));
            continueButton.click();

            // Navigate back to the previous page
            driver.navigate().back();

            // Navigate forward
            driver.navigate().forward();

            // Click the sell menu
            WebElement sellMenu = driver.findElement(By.linkText("Sell"));
            sellMenu.click();

            // Click the hamburger menu
            WebElement hamburgerMenu = driver.findElement(By.id("nav-hamburger-menu"));
            hamburgerMenu.click();

            // Adding a sleep for 1 second
            Thread.sleep(1000);

            // Navigate back
            driver.navigate().back();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
