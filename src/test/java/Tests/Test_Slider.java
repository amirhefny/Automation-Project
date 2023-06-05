package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import Pages.Page_Login;
import Pages.Page_Slider;

public class Test_Slider extends Test_Basis {

	Page_Login Object_One = new Page_Login(driver);

	Page_Slider Object_Two = new Page_Slider(driver);

	@Test(enabled = true)
	public void Slider() throws InterruptedException {
		Object_One.Login("training@jalaacademy.com", "jobprogram");
		Object_Two.Slider();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'left: 60%;')", Object_Two.Move_Slider);
		Object_Two.Move_Slider.click();
	}
}
