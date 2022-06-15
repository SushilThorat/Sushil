package testngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCountFlag {
  
	 @Test(invocationCount = 1000)
	 
	  public void login()
	 {
		  Reporter.log("inconsistent bug",true);
	 }
	 
}
