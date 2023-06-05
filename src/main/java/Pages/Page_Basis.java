package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Page_Basis {
	WebDriver driver;
	public Page_Basis(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public static void Click_Button(WebElement Button) {
		Button.click();
	}
}
