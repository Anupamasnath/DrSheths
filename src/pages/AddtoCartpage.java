package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCartpage {
	
	WebDriver driver;
	By cartbtn = By.name("add");
	
	public AddtoCartpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void selection()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(cartbtn).click();
	}

}
