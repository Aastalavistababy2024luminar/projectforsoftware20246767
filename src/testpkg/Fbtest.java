package testpkg;

import org.junit.Test;

import basepkg.Baseclass;
import pagepkg.Fbpage;
import utilitiespackage.Excelutil;

public class Fbtest extends Baseclass {
	@Test
	public void verifyLoginWithValidCred () throws Exception
	{
		Fbpage p1 = new Fbpage(driver);
		
		//Reading the data from excel file by the specified path
		
		          String x1="D:\\data.xlsx";
		          String Sheet = "Sheet1";
		          int rowCount=Excelutil.getRowCount(x1, Sheet);
		          for (int i=1;i<=rowCount;i++)
		          {
		        	  
		        	    String UserName=Excelutil.getCellValue(x1, Sheet, i, 0);
		        	      System.out.println("username---" + UserName);
		        	      String Pwd=Excelutil.getCellValue(x1, Sheet, i, 1);
		        	      System.out.println("password----" + Pwd );
		        	      
		        	      //Passing Username and password as parameters
		        	      //Submitting the data by clicking on login button
		        	      //p1.setvalues("","");
		        	      p1.setvalues(UserName, Pwd);
		        	      p1.login();
		        	      
		          }
	}

}
