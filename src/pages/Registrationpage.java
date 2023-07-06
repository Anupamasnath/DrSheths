package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registrationpage {
	
	WebDriver driver;
	By fname = By.name("customer[first_name]");
	By lname = By.name("customer[last_name]");
	By mail = By.name("customer[email]");
	By password = By.name("customer[password]");
	By submit = By.xpath("//input[@value='Submit']");
	
	
	
	public Registrationpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public void register(String firstname,String lastname,String email,String pswd)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(fname).sendKeys(firstname);
		driver.findElement(lname).sendKeys(lastname);
		driver.findElement(mail).sendKeys(email);
		driver.findElement(password).sendKeys(pswd);
		
		
		driver.findElement(submit).click();
		
	}

}
