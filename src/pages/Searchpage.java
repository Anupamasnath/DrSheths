package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchpage {

	WebDriver driver;
	By search = By.name("s");
	By selection = By.xpath("//img[@src='https://cdn.shopify.com/s/files/1/0490/6011/8686/products/7_large.jpg?v=1681469262']");
	
	
	public Searchpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public void search(String searchitem) {
		driver.findElement(search).sendKeys(searchitem);
		driver.findElement(selection).click();
	}
	
	
	
	
}
