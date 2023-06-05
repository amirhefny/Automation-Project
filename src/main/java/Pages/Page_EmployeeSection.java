package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Page_EmployeeSection extends Page_Basis {

	public Page_EmployeeSection(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[2]/a/span")
	WebElement EmployeeSection;

	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")
	WebElement Create_Employee;

	@FindBy(id = "FirstName")
	WebElement First_Name;

	@FindBy(id = "LastName")
	WebElement Last_Name;

	@FindBy(id = "EmailId")
	WebElement Email;

	@FindBy(id = "MobileNo")
	WebElement Mobile_Number;

	@FindBy(id = "DOB")
	WebElement Date_Of_Birth;

	@FindBy(id = "rdbFemale")
	WebElement Gender_Female;

	@FindBy(id = "Address")
	WebElement Address;

	@FindBy(id = "CountryId")
	WebElement Country;

	@FindBy(xpath = "//*[@id=\"CityId\"]")
	WebElement City;

	@FindBy(id = "chkSkill_1")
	WebElement First_Skill;

	@FindBy(id = "chkSkill_4")
	WebElement Second_Skill;

	@FindBy(xpath = "//*[@id=\"frmEmployee\"]/div[2]/button")
	WebElement save;

	@FindBy(id = "Name")
	WebElement Name;

	@FindBy(id = "MobileNo")
	WebElement Mobile_No;

	@FindBy(id = "btnSearch")
	WebElement Search;

	@FindBy(id = "btnClear")
	WebElement Clear;

	@FindBy(xpath = "//*[@id=\"tblEmployee\"]/thead/tr/th[1]")
	WebElement First_Name_Filter;

	@FindBy(xpath = "//*[@id=\"tblEmployee\"]/thead/tr/th[2]")
	WebElement Last_Name_Filter;

	@FindBy(xpath = "//*[@id=\"tblEmployee\"]/thead/tr/th[3]")
	WebElement Mobile_No_Filter;

	@FindBy(xpath = "//*[@id=\"tblEmployee\"]/thead/tr/th[4]")
	WebElement Email_ID_Filter;

	@FindBy(xpath = "//*[@id=\"tblEmployee\"]/thead/tr/th[6]")
	WebElement Birth_Data_Filter;

	@FindBy(xpath = "//*[@id=\"tblEmployee\"]/thead/tr/th[7]")
	WebElement Country_Filter;

	@FindBy(xpath = "//*[@id=\"tblEmployee\"]/thead/tr/th[8]")
	WebElement City_Filter;

	@FindBy(xpath = "/html/body/div[3]/div/section[2]/div/form/div/div[2]/div[3]/nav/div[1]/ul/li[4]/a")
	WebElement Next_Page;

	@FindBy(xpath = "//*[@id=\"liLast_EmployeeGrid\"]/a")
	WebElement Last_Page;

	@FindBy(xpath = "//*[@id=\"liPrevious_EmployeeGrid\"]/a")
	WebElement Previous_Page;

	@FindBy(xpath = "//*[@id=\"liFirst_EmployeeGrid\"]/a")
	WebElement First_Page;

	@FindBy(xpath = "//*[@id=\"tblEmployee\"]/tbody/tr[9]/td[9]/a[2]")
	WebElement Delete;

	@FindBy(xpath = "/html/body/div[4]/div/div[10]/button[1]")
	WebElement Delete_Button;

	@FindBy(xpath = "//*[@id=\"toast-container\"]/div")
	WebElement amir;

	public void EmployeeSection() {
		EmployeeSection.click();
		Create_Employee.click();
	}

	public void EmployeeDataCreating(String firstname, String lastname, String email, String mobilephone,
			String dateofbirth, String adress) throws InterruptedException {
		First_Name.clear();
		First_Name.sendKeys(firstname);
		Last_Name.clear();
		Last_Name.sendKeys(lastname);
		Email.clear();
		Email.sendKeys(email);
		Mobile_Number.clear();
		Mobile_Number.sendKeys(mobilephone);
		Date_Of_Birth.clear();
		Date_Of_Birth.sendKeys(dateofbirth);
		if (Gender_Female.isSelected()) {
		} else {
			Gender_Female.click();
		}
		Address.clear();
		Address.sendKeys(adress);
		Select drpCountry = new Select(Country);
		drpCountry.selectByIndex(3);
		Thread.sleep(2000);
		Select drpCity = new Select(City);
		drpCity.selectByValue("63");
		First_Skill.click();
		Second_Skill.click();
		save.click();

	}

	public void Search_Employee(String name, String mobile) throws InterruptedException {
		Name.clear();
		Name.sendKeys(name);
		Mobile_No.clear();
		Mobile_No.sendKeys(mobile);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
		Clear.click();
	}

	public void Filter() {
		First_Name_Filter.click();
		Last_Name_Filter.click();
		Mobile_No_Filter.click();
		Email_ID_Filter.click();
		Birth_Data_Filter.click();
		Country_Filter.click();
		City_Filter.click();
	}

	public void Pages() throws InterruptedException {
		Thread.sleep(2000);
		Next_Page.click();
		Thread.sleep(2000);
		Next_Page.click();
		Thread.sleep(2000);
		Last_Page.click();
		Thread.sleep(2000);
		Previous_Page.click();
		Thread.sleep(2000);
		First_Page.click();
		Thread.sleep(2000);

	}

	public void DeleteRow() throws InterruptedException {
		Delete.click();
		Delete_Button.click();
		Thread.sleep(2000);
		System.out.println(amir.getText());
		Assert.assertEquals(amir.isDisplayed(), true);
	}
}
