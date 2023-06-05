package Tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Page_CssProperties;
import Pages.Page_Login;

public class Test_CssProperties extends Test_Basis {
	Page_Login Object_One = new Page_Login(driver);
	Page_CssProperties Object_Two = new Page_CssProperties(driver);
	@Test(priority = 1)
	public void Css_Properties_Links() throws InterruptedException {
		Object_One.Login("training@jalaacademy.com", "jobprogram");

		Object_Two.Css_Properties_Links();

		Assert.assertEquals(Object_Two.Link1.getCssValue("color"), "rgba(255, 0, 0, 1)");

		Assert.assertEquals(Object_Two.Link2.getCssValue("color"), "rgba(0, 0, 255, 1)");

		Assert.assertEquals(Object_Two.Link3.getCssValue("color"), "rgba(0, 128, 0, 1)");

		Assert.assertEquals(Object_Two.Link4.getCssValue("color"), "rgba(255, 165, 0, 1)");

		Assert.assertEquals(Object_Two.Link5.getCssValue("color"), "rgba(75, 0, 130, 1)");
	}
	@Test(priority = 2)
	public void Css_Properties_Labels() throws InterruptedException {
		Object_Two.Css_Properties_Labels();

		Assert.assertEquals(Object_Two.Label1.getCssValue("background-color"), "rgba(210, 214, 222, 1)");
		Assert.assertEquals(Object_Two.Label1.getCssValue("color"), "rgba(68, 68, 68, 1)");
		Assert.assertEquals(Object_Two.Label1.getCssValue("display"), "inline");

		Assert.assertEquals(Object_Two.Label1.getCssValue("background-color"), "rgba(210, 214, 222, 1)");

		Assert.assertEquals(Object_Two.Label1.getCssValue("background-color"), "rgba(210, 214, 222, 1)");

		Assert.assertEquals(Object_Two.Label1.getCssValue("background-color"), "rgba(210, 214, 222, 1)");
		Assert.assertEquals(Object_Two.Label1.getCssValue("font-weight"), "700");

		Assert.assertEquals(Object_Two.Label1.getCssValue("background-color"), "rgba(210, 214, 222, 1)");

		Assert.assertEquals(Object_Two.Label1.getCssValue("background-color"), "rgba(210, 214, 222, 1)");
	}
	@Test(priority = 3)
	public void Css_Properties_Buttons() throws InterruptedException {
		Object_Two.Css_Properties_Buttons();

		Assert.assertEquals(Object_Two.Button1.getCssValue("border-color"), "rgb(221, 221, 221)");

		Assert.assertEquals(Object_Two.Button2.getCssValue("border-color"), "rgb(54, 127, 169)");

		Assert.assertEquals(Object_Two.Button3.getCssValue("border-color"), "rgb(0, 141, 76)");

		Assert.assertEquals(Object_Two.Button4.getCssValue("border-color"), "rgb(224, 142, 11)");

		Assert.assertEquals(Object_Two.Button5.getCssValue("border-color"), "rgb(215, 57, 37)");
		Assert.assertEquals(Object_Two.Button5.getCssValue("line-height"), "20px");
	}
	@Test(priority = 4)
	public void Css_Properties_Alerts() throws InterruptedException {
		Object_Two.Css_Properties_Alerts();

		Assert.assertEquals(Object_Two.Alert1.getCssValue("background-color"), "rgba(0, 166, 90, 1)");
		Assert.assertEquals(Object_Two.Alert1.getCssValue("border-radius"), "3px");

		Assert.assertEquals(Object_Two.Alert2.getCssValue("background-color"), "rgba(0, 192, 239, 1)");

		Assert.assertEquals(Object_Two.Alert3.getCssValue("background-color"), "rgba(243, 156, 18, 1)");

		Assert.assertEquals(Object_Two.Alert4.getCssValue("background-color"), "rgba(221, 75, 57, 1)");
		List<WebElement> Close_Alerts = driver.findElements(By.className("close"));
		for (WebElement e : Close_Alerts) {
			e.click();
		}
	}
	@Test(priority = 5)
	public void Css_Properties_Progress_Bars() throws InterruptedException {
		Object_Two.Css_Properties_Progress_Bars();

		Assert.assertEquals(Object_Two.Bar1.getCssValue("background-color"), "rgba(0, 166, 90, 1)");
		Assert.assertEquals(Object_Two.Bar1.getCssValue("box-sizing"), "border-box");
		
		Assert.assertEquals(Object_Two.Bar1.getCssValue("background-color"), "rgba(0, 166, 90, 1)");

		Assert.assertEquals(Object_Two.Bar1.getCssValue("background-color"), "rgba(0, 166, 90, 1)");

		Assert.assertEquals(Object_Two.Bar1.getCssValue("background-color"), "rgba(0, 166, 90, 1)");
	}

}
