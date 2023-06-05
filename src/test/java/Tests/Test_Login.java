package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Page_Login;

public class Test_Login extends Test_Basis{
	Page_Login Object = new Page_Login(driver);
	@Test
	public void Valid_Login() {
		Object.Login("training@jalaacademy.com", "jobprogram");
		Assert.assertEquals(driver.getCurrentUrl(), "https://magnus.jalatechnologies.com/");
		
	}

}
