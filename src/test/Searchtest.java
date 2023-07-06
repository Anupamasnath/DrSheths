package test;

import org.testng.annotations.Test;

import pages.AddtoCartpage;
import pages.Searchpage;

public class Searchtest extends Base{
	
	@Test
	public void test2() {
		
		Searchpage pg3 = new Searchpage(driver);
		pg3.search("Sunscreen");
		
		AddtoCartpage pg4 = new AddtoCartpage(driver);
		pg4.selection();
		
	}
	

}
