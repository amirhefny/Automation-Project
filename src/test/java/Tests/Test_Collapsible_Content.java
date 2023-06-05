package Tests;

import org.testng.annotations.Test;

import Pages.Page_Collapsible_Content;
import Pages.Page_Login;

public class Test_Collapsible_Content extends Test_Basis {
	Page_Login Object = new Page_Login(driver);
	Page_Collapsible_Content Object2 = new Page_Collapsible_Content(driver);
	@Test
	public void Collapsible_Content() throws InterruptedException {
		Object.Login("training@jalaacademy.com", "jobprogram");
		Object2.Collapsible_Content();
	}

}
