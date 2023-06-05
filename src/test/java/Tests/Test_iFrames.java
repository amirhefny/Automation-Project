package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Page_Login;
import Pages.Page_iFrames;

public class Test_iFrames extends Test_Basis {
	Page_Login Object_One = new Page_Login(driver);
	Page_iFrames Object_Two = new Page_iFrames(driver);
	@Test
	public void Test_IFrame() throws InterruptedException {
		Object_One.Login("training@jalaacademy.com", "jobprogram");
		
		Object_Two.iFrame();
		//to switch to iFrame two
		driver.switchTo().frame("iframe2");
		Assert.assertEquals(Object_Two.frame_two.getText(), "Magnus");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.switchTo().defaultContent();
		
		js.executeScript("window.scrollBy(0,600)");
		Assert.assertEquals(Object_Two.frame_three.getText(), "Frame Three");
	}
}
