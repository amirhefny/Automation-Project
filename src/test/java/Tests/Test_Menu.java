package Tests;

import org.testng.annotations.Test;

import Pages.Page_Login;
import Pages.Page_Menu;

public class Test_Menu extends Test_Basis {
	Page_Login Object = new Page_Login(driver);
	Page_Menu Object2 = new Page_Menu(driver);
	@Test (priority =1)
	public void Single_Menus() throws InterruptedException {
		Object.Login("training@jalaacademy.com", "jobprogram");
		Object2.Single_Menus();
		
	}
	@Test(priority =2)
	public void Sub_Menus() throws InterruptedException {
		Object.Login("training@jalaacademy.com", "jobprogram");
		Object2.Sub_Menus();
	}
}
