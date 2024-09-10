package pkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class responsecodepgm {
	ChromeDriver driver;
	String baseur1="https://www.google.com";
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(baseur1);
	}
	@Test
	public void linkcount() throws Exception
	{
		URL ob=new URL(baseur1);
		
		       HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		       //int code=con.getresponsecode();
		       //System.out.println(code);
		       con.connect();
		       if(con.getResponseCode()==200)
		       {
		    	   System.out.println("valid url");
		       }
		       else
		       {
		    	   System.out.println("invalid url");
		       }
	}

}
