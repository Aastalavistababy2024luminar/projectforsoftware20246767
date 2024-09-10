package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class blazedemo {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://blazedemo.com/login");

        // Locate the email address field and enter the email
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("danydavid@gmail.com");

        // Locate the password field and enter the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("danydavidpalakkad2024");

        // Locate the login button and click it
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Optional: Verify the login, wait, or perform other actions
        // ...

        // Close the browser
        driver.quit();
    }
}