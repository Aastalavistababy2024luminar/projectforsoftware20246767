package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class linkpgm {
    WebDriver driver;

    @Before
    public void setUp() {
        // Ensure ChromeDriver is correctly set up in your environment
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void linkCount() {
        // Find all elements with the tag name "a"
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: " + links.size());

        // Iterate over each link and print the href attribute and link text
        for (WebElement link : links) {
            String href = link.getAttribute("href");
            String text = link.getText();
            System.out.println(href + " ------ " + text);
        }
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}