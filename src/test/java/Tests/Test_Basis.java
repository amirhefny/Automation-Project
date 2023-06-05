package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test_Basis {
	//Driver Initialization
	WebDriver driver = new EdgeDriver();

	@BeforeTest
	public void Open_URL() {
		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void Close() {
		// driver.close();
	}
}
