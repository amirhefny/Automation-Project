package Tests;

import org.testng.annotations.Test;

import Pages.Page_Login;
import Pages.Page_Multiple_Tabs;

public class Test_Multiple_Tabs extends Test_Basis {
	Page_Login Object = new Page_Login(driver);
	Page_Multiple_Tabs Object2 = new Page_Multiple_Tabs(driver);
	@Test(enabled = true)
	public void Multiple_Tabs() throws InterruptedException {
		Object.Login("training@jalaacademy.com", "jobprogram");
		Thread.sleep(1000);
		Object2.Multiple_Tab_One("Peter", "0165465");
		Object2.Multiple_Tab_Two("Michael", "1654654");
		Object2.Multiple_Tab_Three("Muller", "9787916");

	}
	@Test(enabled = false)
	public void Slider() throws InterruptedException {
		Object.Login("training@jalaacademy.com", "jobprogram");
		Thread.sleep(1000);
		Object2.Slider();
	}
}
