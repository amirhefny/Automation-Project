package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_CssProperties extends Page_Basis {

	public Page_CssProperties(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/a")
	WebElement More;

	@FindBy(xpath="//*[@id=\"MenusDashboard\"]/li[3]/ul/li[10]/a")
	WebElement Css_Properties;

	//Links Section
	@FindBy(linkText = "Link 1")
	public WebElement Link1;

	@FindBy(linkText = "Link 2")
	public WebElement Link2;

	@FindBy(linkText = "Link 3")
	public WebElement Link3;

	@FindBy(linkText = "Link 4")
	public WebElement Link4;

	@FindBy(linkText = "Link 5")
	public WebElement Link5;

	//Labels Section
	@FindBy(xpath="//*[@id=\"frmCssProperties\"]/div/div/div/div/ul/li[2]/a")
	WebElement Labels;

	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/span[1]")
	public WebElement Label1;

	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/span[2]")
	public WebElement Label2;

	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/span[3]")
	public WebElement Label3;

	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/span[4]")
	public WebElement Label4;

	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/span[5]")
	public WebElement Label5;

	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/span[6]")
	public WebElement Label6;

	//Buttons Section
	@FindBy(xpath="//*[@id=\"frmCssProperties\"]/div/div/div/div/ul/li[3]/a")
	WebElement Buttons;

	@FindBy(className = "btn-default")
	public WebElement Button1;

	@FindBy(className = "btn-primary")
	public WebElement Button2;

	@FindBy(className = "btn-success")
	public WebElement Button3;

	@FindBy(className = "btn-warning")
	public WebElement Button4;

	@FindBy(className = "btn-danger")
	public WebElement Button5;

	//Alerts Section
	@FindBy(xpath="//*[@id=\"frmCssProperties\"]/div/div/div/div/ul/li[4]/a")
	WebElement Alerts;

	@FindBy(className = "alert-success")
	public WebElement Alert1;

	@FindBy(className = "alert-info")
	public WebElement Alert2;

	@FindBy(className = "alert-warning")
	public WebElement Alert3;

	@FindBy(className = "alert-danger")
	public WebElement Alert4;

	//Progress Bars
	@FindBy(xpath="//*[@id=\"frmCssProperties\"]/div/div/div/div/ul/li[5]/a")
	WebElement Progress_Bars;

	@FindBy(className = "progress-bar-success")
	public WebElement Bar1;

	@FindBy(className = "progress-bar-info")
	public WebElement Bar2;

	@FindBy(className = "progress-bar-warning")
	public WebElement Bar3;

	@FindBy(className = "progress-bar-danger")
	public WebElement Bar4;


	public void Css_Properties_Links() throws InterruptedException {
		Thread.sleep(2000);
		Click_Button(More);
		Thread.sleep(2000);
		Click_Button(Css_Properties);
	}
	public void Css_Properties_Labels() throws InterruptedException {
		Thread.sleep(3000);
		Click_Button(Labels);
	}
	public void Css_Properties_Buttons() throws InterruptedException {
		Thread.sleep(3000);
		Click_Button(Buttons);
	}
	public void Css_Properties_Alerts() throws InterruptedException {
		Thread.sleep(3000);
		Click_Button(Alerts);	  
	}
	public void Css_Properties_Progress_Bars() throws InterruptedException {
		Thread.sleep(3000);
		Click_Button(Progress_Bars);
	}
}