package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class loginoctober {
    public static void main(String args[]) {
        // Setup ChromeDriver using WebDriverManager
//        WebDriverManager.chromedriver().setup();
        
        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Access the website of SwagLabs
            driver.get("https://www.saucedemo.com/");
            
            // Locate and fill the username field
            WebElement username = driver.findElement(By.id("user-name"));
            username.sendKeys("standard_user");
            
            // Locate and fill the password field
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("secret_sauce");
            
            // Locate and click the login button
            WebElement login = driver.findElement(By.id("login-button"));
            login.click();
            
            // Locate the logo element on the home page
            WebElement logo = driver.findElement(By.xpath("//div[@class='app_logo']"));
            
            // Print the text of the logo
            System.out.println(logo.getText());
        } finally {
            // Close the driver instance
            driver.quit();
        }
    }
}
