package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class guru99demosite {
    WebDriver driver;

    @Test
    public void testRightAndDoubleClick() {
        // Set up the ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        
        // Open the webpage
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        
        // Perform Right-click (Context Click)
        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickButton).perform(); // Right-click on the button
        
        // Click on 'Edit' option from the context menu
        WebElement editOption = driver.findElement(By.xpath("//ul/li[contains(text(),'Edit')]"));
        editOption.click();
        
        // Handle the alert that appears after clicking 'Edit'
        Alert alert1 = driver.switchTo().alert();
        System.out.println("Alert Text after Right-Click: " + alert1.getText());
        alert1.accept(); // Accept the alert
        
        // Perform Double-click
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(doubleClickButton).perform(); // Double-click on the button
        
        // Handle the alert that appears after double-click
        Alert alert2 = driver.switchTo().alert();
        System.out.println("Alert Text after Double-Click: " + alert2.getText());
        alert2.accept(); // Accept the alert
        
        // Close the browser
        driver.quit();
    }
}