package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_iFrames extends Page_Basis {

	public Page_iFrames(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/a")
	WebElement More;
	
	@FindBy(xpath="//*[@id=\"MenusDashboard\"]/li[3]/ul/li[11]/a")
	WebElement iFrames;
	
	@FindBy(xpath = "/html/body/div[2]/header/a/span[2]")
	public WebElement frame_two;
	
	@FindBy(xpath="//*[@id=\"tab_1\"]/div[3]/h3")
	 public WebElement frame_three;
	
	public void iFrame() throws InterruptedException {
		Thread.sleep(2000);
		Click_Button(More);
		Thread.sleep(2000);
		Click_Button(iFrames);
		
	}
}
