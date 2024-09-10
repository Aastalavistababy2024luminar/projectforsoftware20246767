package testng;

import java.rmi.AccessException;

import javax.crypto.KeyAgreement;
import javax.sql.RowSet;

import org.hamcrest.StringDescription;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.drawingml.x2006.diagram.STDirection;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void urlloading() {
    	driver.get("https://www.ilovepdf.com/pdf_to_word");
    }
    @Test
    public void test1() throws Exception
    {
    	driver.findElement(By.xpath("//*[@id='pickfiles']/span")).click();
    	
    	fileUpload("D:\\Consolidate.pdf");
    }
    public void fileUpload(String filePath) throws AWTException {
        // Copy the file path to the clipboard
        StringSelection strSelection = new StringSelection(filepath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
        //to paste into sysmwidow
        Robot robot=new Robot();
        robot.delay(3000);
        robot.keypress(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        //Thread.sleep (5000);
        robot.keyRelease(KeyEvent.VK_ENTER);
     
        
    }
    }
