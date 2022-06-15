package testngFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class descriptionFlag {
	
	@Test(description = "This method performs login operation")
	public void login()
	{
		Reporter.log("Login is performed",true);

	}
}