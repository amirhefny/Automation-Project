package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Collapsible_Content extends Page_Basis {

	public Page_Collapsible_Content(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/a")
	WebElement More;
	@FindBy(xpath="//*[@id=\"MenusDashboard\"]/li[3]/ul/li[4]/a")
	WebElement Collapsible_Content;
	@FindBy(xpath = "//*[@id=\"headingOne\"]/h4/a")
	WebElement First_Pargraph;
	@FindBy(xpath = "//*[@id=\"headingTwo\"]/h4/a")
	WebElement Second_Pargraph;
	@FindBy(xpath = "//*[@id=\"headingThree\"]/h4/a")
	WebElement Third_Pargraph;
	
	
	
	public void Collapsible_Content() throws InterruptedException {
		Thread.sleep(2000);
		More.click();
		Thread.sleep(2000);
		Collapsible_Content.click();
		Thread.sleep(2000);
		First_Pargraph.click();
		Second_Pargraph.click();
		Thread.sleep(2000);
		Third_Pargraph.click();
	}
}
