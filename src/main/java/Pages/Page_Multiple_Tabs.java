package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Multiple_Tabs extends Page_Basis {

	public Page_Multiple_Tabs(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/a")
	WebElement More;
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/ul/li[1]/a")
	WebElement Multiple_Tab_One;
	@FindBy(id = "textbox1")
	WebElement TextBox_One;
	@FindBy(id = "textbox2")
	WebElement TextBox_Two;

	@FindBy(xpath = "//*[@id=\"frmTabs\"]/div/div/div/div/ul/li[2]/a")
	WebElement Multiple_Tab_Two;
	@FindBy(id = "textbox3")
	WebElement TextBox_Three;
	@FindBy(id = "textbox4")
	WebElement TextBox_Four;

	@FindBy(xpath = "//*[@id=\"frmTabs\"]/div/div/div/div/ul/li[3]/a")
	WebElement Multiple_Tab_Three;
	@FindBy(id = "textbox5")
	WebElement TextBox_Five;
	@FindBy(id="textbox6")
	WebElement TextBox_Sex;

	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/ul/li[6]/a")
	WebElement Slider;
	public void Multiple_Tab_One(String TextBoxOne, String TextBoxtwo) throws InterruptedException {
		More.click();
		Thread.sleep(2000);
		Multiple_Tab_One.click();
		TextBox_One.clear();
		TextBox_One.sendKeys(TextBoxOne);
		TextBox_Two.clear();
		TextBox_Two.sendKeys(TextBoxtwo);
	}
	public void Multiple_Tab_Two(String TextBoxThree , String TextBoxFour) {
		Multiple_Tab_Two.click();
		TextBox_Three.clear();
		TextBox_Three.sendKeys(TextBoxThree);
		TextBox_Four.clear();
		TextBox_Four.sendKeys(TextBoxFour);

	}
	public void Multiple_Tab_Three(String TextBoxFive , String TextBoxSex) {
		Multiple_Tab_Three.click();
		TextBox_Five.clear();
		TextBox_Five.sendKeys(TextBoxFive);
		TextBox_Sex.clear();
		TextBox_Sex.sendKeys(TextBoxSex);
	}
	public void Slider() throws InterruptedException {
		More.click();
		Thread.sleep(2000);
		Slider.click();
		
	}
}
