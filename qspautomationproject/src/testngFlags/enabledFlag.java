package testngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabledFlag {
	
	@Test(enabled = true)
	public void login()
	{
		Reporter.log("login performed",true);
	}


	@Test(enabled =false)
	public void logout()
	{
		Reporter.log("logout performed",true);
	}
}
