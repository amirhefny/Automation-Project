package Pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Links extends Page_Basis {

	public Page_Links(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/a")
	WebElement More;

	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/ul/li[9]/a")
	WebElement Links;

	public void Working_Links() throws InterruptedException {
		Thread.sleep(2000);
		Click_Button(More);
		Thread.sleep(2000);
		Click_Button(Links);
		Thread.sleep(2000);
	}

	public static void Verify_Link() throws IOException {

	}
}
