package SampleGitProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoProject {
	
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.out.println("user register");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@Test
	public void loginTest()
	{
		System.out.println("login test");
		driver.get("http://www.gmail.com");
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("close browser");
		driver.close();
	}
}
