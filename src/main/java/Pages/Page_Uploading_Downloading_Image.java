package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Uploading_Downloading_Image extends Page_Basis {

	public Page_Uploading_Downloading_Image(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/a")
	WebElement More;

	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/ul/li[5]/a")
	WebElement Images;

	@FindBy(id = "file")
	WebElement Choose_File;

	@FindBy(className = "btn-success")
	WebElement Upload_Button;
	
	@FindBy(xpath = "//*[@id=\"toast-container\"]/div")
	public WebElement Uploading_Message;

	public void Uploading_Images() throws InterruptedException {
		Thread.sleep(3000);
		Click_Button(More);
		Thread.sleep(3000);
		Click_Button(Images);
		Thread.sleep(3000);
		String Image_Name = "47124485.jpg";
		String Image_Path = System.getProperty("user.dir") + "/Uploads_Images/" + Image_Name;
		Choose_File.sendKeys(Image_Path);
		Click_Button(Upload_Button);
		Thread.sleep(3000);
	}
}
