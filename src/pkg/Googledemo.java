package pkg;
import org.openqa.selenium.chrome.ChromeDriver;
public class Googledemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com " );
        String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String exp="Google";
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		
		//driver.close();
		//driver.quit();
		
		
		
	}

}
