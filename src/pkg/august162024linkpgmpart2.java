package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class august162024linkpgmpart2 {
    ChromeDriver driver;

    @Before
    public void set() {
        // Set the path to your ChromeDriver executable here, or make sure it's in your PATH
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void linkcount() {
        List<WebElement> li = driver.findElements(By.tagName("a"));
        for (WebElement s : li) {
            String link = s.getAttribute("href");
            if (link != null && !link.isEmpty()) {
                verify(link);
            }
        }
    }
    

    private void verify(String link) {
        try {
            URL ob = new URL(link);
            HttpURLConnection con = (HttpURLConnection) ob.openConnection();
            con.connect();
            if (con.getResponseCode() == 200) {
                System.out.println("Valid link: " + link);
            } else if (con.getResponseCode() == 404) {
                System.out.println("Broken link: " + link);
            }
        } catch (Exception e) {
            System.out.println("Error verifying link: " + link + " - " + e.getMessage());
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}