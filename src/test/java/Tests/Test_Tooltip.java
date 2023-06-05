package Tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Page_Login;
import Pages.Page_Tooltip;

public class Test_Tooltip extends Test_Basis {

	Page_Login Object_One = new Page_Login(driver);
	Page_Tooltip Object_Two = new Page_Tooltip(driver);

	@Test(enabled = true)
	public void Tooltip() throws InterruptedException {
		Object_One.Login("training@jalaacademy.com", "jobprogram");
		Object_Two.Tooltips();
		Actions action = new Actions(driver);
		action.moveToElement(Object_Two.button_Tooltip).build().perform();
		// Assert.assertEquals(Object_Two.button_Tooltip.getAttribute("data-original-title"),
		// "You have not clicked this BUTTON yet. Please Click me and check the
		// tooltip");
		if (Object_Two.button_Tooltip.getAttribute("data-original-title")
				.contains("You have not clicked this BUTTON yet.")) {
			Object_Two.button_Tooltip.click();
		} else {
			Assert.assertTrue(false);
		}
		Assert.assertEquals(Object_Two.button_Tooltip.getAttribute("data-original-title"), "Thank you for being here!");

	}
}
