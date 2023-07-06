package test;

import org.testng.annotations.Test;

import pages.Createaccpage;
import pages.Registrationpage;

public class Createacctest extends Base {

	@Test
	public void test1()
	{
		Createaccpage pg1 = new Createaccpage(driver);
		pg1.create();
		
		Registrationpage pg2 = new Registrationpage(driver);
		pg2.register("Anupama", "S Nath", "anupamahariprasad@outlook.com", "Anupama@123");
	}
}
