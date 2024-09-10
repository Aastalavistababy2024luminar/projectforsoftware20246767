package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Windowshandling {
    public static void main(String[] args) {
        // Set up the WebDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open the Amazon website
        driver.get("https://www.amazon.com");

        // Store the current window handle
        String mainWindow = driver.getWindowHandle();

        // Open a new tab or window and switch to it (this can be done by clicking on a link that opens a new window)
        // For example:
        // driver.findElement(By.linkText("New Window")).click();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Iterate through all window handles
        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                // Switch to the new window
                driver.switchTo().window(window);
                // Perform any actions in the new window
                System.out.println("Switched to new window: " + driver.getTitle());
                // Close the new window
                driver.close();
            }
        }

        // Switch back to the main window
        driver.switchTo().window(mainWindow);
        System.out.println("Switched back to main window: " + driver.getTitle());

        // Close the main browser window
        driver.quit();
    }
}