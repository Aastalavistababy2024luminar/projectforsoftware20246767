package pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class october2024 {

	public static void main(String[] args) throws InterruptedException {
         // page object model
		//Instantiating chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Opening web application
		driver.get("https://www.emirates.com/");
		
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		//Locating the Login button and clicking on it
		driver.findElement(By.xpath("//*[@id=\"login-nav-link\"]/span[1]")).click();
		
		//Locating the username & password and passing the credentials
		
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div/div/div[1]/section/form/div[1]/span/label")).sendKeys("gunjankaushik@gmail.com");
		driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div/div/div[1]/section/form/div[2]/span/label")).sendKeys("Passwordshawnaloysious@123");
		driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div[2]/div/div/div[1]/section/form/div[3]/div/label")).click();
		
		//Click on the login button
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		//Print the web page heading
		System.out.println("The page title is : " +driver.findElement(By.xpath("/html/body/nav/div/div/div[2]/a")).getText());

		//Click on Logout button
		driver.findElement(By.xpath("submit")).click();
		
		//Close driver instance
		//driver.quit();
	}

}