package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_Login extends Page_Basis {

	public Page_Login(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="UserName")
	WebElement User_Name;
	@FindBy(id="Password")
	WebElement Password;
	@FindBy(xpath = "//*[@id=\"frmLogin\"]/div[4]/div[1]/label/span")
	WebElement Remember_Me;
	@FindBy(id="btnLogin")
	WebElement Sign_In;
	public void Login(String username , String password) {
		User_Name.clear();
		User_Name.sendKeys(username);
		Password.clear();
		Password.sendKeys(password);
		Remember_Me.click();
		Sign_In.click();
	}

}
