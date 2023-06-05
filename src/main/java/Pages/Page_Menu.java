package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Page_Menu extends Page_Basis{

	public Page_Menu(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/a/span")
	WebElement More;
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/ul/li[2]/a")
	WebElement Menu;
	@FindBy(xpath = "//*[@id=\"b1\"]")
	WebElement First_Selection;
	@FindBy(id = "b2")
	WebElement Second_Selection;
	@FindBy(id = "label")
	WebElement Selected_Value;
//	@FindBy(xpath = "//*[@id=\"tab_2\"]/ul/li[1]/a")
//	WebElement Sub_Menus1;
	@FindBy(xpath = "/html/body/div[3]/div/section[2]/form/div/div/div/div/ul/li[2]")////*[@id="tab_2"]/ul/li[1]/a
	WebElement Sub_Menus2;
	public void Single_Menus() throws InterruptedException {
		Thread.sleep(2000);
		More.click();
		Thread.sleep(2000);
		Menu.click();
		Thread.sleep(1000);
		First_Selection.click();
		Thread.sleep(2000);
		Second_Selection.click();
		Assert.assertEquals(Selected_Value.getText(), "You Have Selected Java Menu Option.");
		
		
	}
	public void Sub_Menus() throws InterruptedException {
		Thread.sleep(5000);
		Sub_Menus2.click();
//		Actions action = new Actions(driver);
//		action.moveToElement(Selected_Value);
		
	}
}
