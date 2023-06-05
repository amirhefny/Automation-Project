package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Tooltip extends Page_Basis{

	public Page_Tooltip(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/a")
	WebElement More;
	
	@FindBy(xpath ="//*[@id=\"MenusDashboard\"]/li[3]/ul/li[7]/a")
	WebElement Tooltip;
	
	@FindBy(id="btnTooltip")
	public WebElement button_Tooltip;
	
	public void  Tooltips() throws InterruptedException {
		Thread.sleep(2000);
		Click_Button(More);
		Thread.sleep(2000);
		Click_Button(Tooltip);
	}

}
