package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Base {
	
	WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.drsheths.com/");
		driver.manage().window().maximize();
	}
	
	
}
