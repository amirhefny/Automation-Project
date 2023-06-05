package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Page_Autocomplete extends Page_Basis {

	public Page_Autocomplete(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/a")
	WebElement More;
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/ul/li[3]/a")
	WebElement Multiple_Tab_One;
	@FindBy(id="txtSingleAutoComplete")
	WebElement Tags;

	@FindBy(id="ui-id-1")
	WebElement Java_Selected;
	@FindBy(xpath="//*[@id=\"frmMenu\"]/div/div/div/div/ul/li[2]/a")
	WebElement Multiple_Values;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[8]")
	WebElement Python_Selected;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li[3]")
	WebElement Java2_Selected;
	@FindBy(id="txtMultipleAutoComplete")
	WebElement Tags2;
	public void Single_Value() throws InterruptedException {
		Thread.sleep(2000);
		More.click();
		Thread.sleep(2000);
		Multiple_Tab_One.click();
		Thread.sleep(2000);
		Tags.clear();
		Tags.sendKeys("j");
		//		WebDriverWait wait = new WebDriverWait (driver,40);
		//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("ui-id-1")));
		Thread.sleep(2000);
		Java_Selected.click();
	}
	public void Multiple_Values() throws InterruptedException {
		Thread.sleep(3000);
		Multiple_Values.click();
		Tags2.click();
		Tags2.sendKeys("p");
		Thread.sleep(2000);
		Python_Selected.click();
		Tags2.sendKeys("a");
		Thread.sleep(2000);
		Java2_Selected.click();
	}

}
