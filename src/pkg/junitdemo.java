package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	
	
	@Before
	public void before() {
		System.out.println("browser open");
	}
	
		@Test
		public void test() {
			System.out.println("test activity");
		}
	
		
			@After
			public void after() {
				System.out.println("browser close");
			}
		
	}



