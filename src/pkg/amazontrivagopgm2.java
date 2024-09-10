package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazontrivagopgm2 {
    WebDriver driver;

    @Before
    public void setup() {
        // Ensure ChromeDriver is correctly set up in your environment
        driver = new ChromeDriver();
    }

    @Test
    public void urlloading() {
        driver.get("https://www.amazon.in");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scrolling down by 1000 pixels
        js.executeScript("window.scrollBy(0,1000)");
        // Clicking on the specified element
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")).click();
    }
}