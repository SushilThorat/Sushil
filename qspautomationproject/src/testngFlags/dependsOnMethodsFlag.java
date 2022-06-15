package testngFlags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethodsFlag {
	@Test
	public void login()
	{
		Reporter.log("login",true);

	}

	@Test(dependsOnMethods = "login")
	public void createUser()
	{
		Assert.fail();
		Reporter.log("Create user",true);

	}

	@Test(dependsOnMethods = "createUser")
	public void logout()
	{

		Reporter.log("logout",true);
	}


}