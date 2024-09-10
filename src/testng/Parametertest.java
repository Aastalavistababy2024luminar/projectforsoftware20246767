package testng;

import org.junit.Test;
import org.testng.annotations.Parameters;


public class Parametertest {
	@Parameters("a")
	@Test
	public void main (String v)
	{
		System.out.println("value is:" + v);
	}

}
