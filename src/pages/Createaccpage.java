package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Createaccpage {

	WebDriver driver;
	
	By login = By.xpath("//a[contains(text(),'My Account')]");
	By cracc = By.xpath("//button[@title='Create an Account']");
	
	public Createaccpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void create()
	{
		driver.findElement(login).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(cracc).click();
	}
	
	
	
}
