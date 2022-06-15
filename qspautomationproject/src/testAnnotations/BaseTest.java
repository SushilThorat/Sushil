package testAnnotations;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
  WebDriver driver;
  @BeforeTest
  public void setproperty()
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  }
  @BeforeMethod
  public void setup() 
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
  }

  @AfterMethod
  public void tearDown() 
  {
	  driver.close();
  }


}
