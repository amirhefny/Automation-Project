package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Slider extends Page_Basis {

	public Page_Slider(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/a")
	WebElement More;

	@FindBy(xpath="//*[@id=\"MenusDashboard\"]/li[3]/ul/li[6]/a")
	WebElement Slider;

	@FindBy(xpath="//*[@id=\"blue\"]/div[1]/div[4]")
	public WebElement Move_Slider;

	public void Slider() throws InterruptedException {
		Thread.sleep(2000);
		Click_Button(More);
		Thread.sleep(2000);
		Click_Button(Slider);
	}
}
