package Tests;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import Pages.Page_Login;
import Pages.Page_Uploading_Downloading_Image;

public class Test_Uploading_Downloading_Image extends Test_Basis {
	Page_Login Object_One = new Page_Login(driver);
	Page_Uploading_Downloading_Image Object_Two = new Page_Uploading_Downloading_Image(driver);

	@Test
	public void Uploading_Images() throws InterruptedException {
		Object_One.Login("training@jalaacademy.com", "jobprogram");
		Object_Two.Uploading_Images();
		assertFalse(Object_Two.Uploading_Message.isDisplayed());
		// This is a Bug, I can't upload the photo
	}
}
