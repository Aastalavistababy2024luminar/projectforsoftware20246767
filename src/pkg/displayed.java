package pkg;



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class displayed {
    ChromeDriver driver;

    @Before
    public void set() {
        // Set the path to the WebDriver executable (if not in system path)
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    }

    @Test
    public void display() {
        // Check if the checkbox is selected
        Boolean b = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
        if (b) {
            System.out.println("Checkbox is selected");
        } else {
            System.out.println("Checkbox is not selected");
        }

        // Check if an image is displayed
        Boolean b1 = driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
        if (b1) {
            System.out.println("Image is displayed");
        } else {
            System.out.println("Image is not displayed");
        }

        // Check if another element (possibly a radio button) is selected
        Boolean c = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
        if (c) {
            System.out.println("Radio button is selected");
        } else {
            System.out.println("Radio button is not selected");
        }
    }
}