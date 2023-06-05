package Tests;

import org.testng.annotations.Test;

import Pages.Page_Autocomplete;
import Pages.Page_Login;

public class Test_Autocomplete extends Test_Basis {
	Page_Login Object = new Page_Login(driver);
	Page_Autocomplete Object2 = new Page_Autocomplete(driver);
	@Test(priority = 1)
	public void Autocomplete_Single_Values() throws InterruptedException {
		Object.Login("training@jalaacademy.com", "jobprogram");
		Object2.Single_Value();
	}
	@Test(priority = 2)
	public void Autocomplete_Multiple_Values() throws InterruptedException {
		Object2.Multiple_Values();
	}
}
