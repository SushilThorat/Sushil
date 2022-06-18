package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) {
		// set path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-t7ev659/login.do");
		driver.findElement(By.id("i1")).sendKeys("admin");
		driver.findElement(By.id("i2")).sendKeys("manager");


	}

}
