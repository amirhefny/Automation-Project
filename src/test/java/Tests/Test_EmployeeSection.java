package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Page_EmployeeSection;
import Pages.Page_Login;

public class Test_EmployeeSection extends Test_Basis {
	Page_Login Object = new Page_Login(driver);
	Page_EmployeeSection Object2 = new Page_EmployeeSection(driver);

	@Test(priority = 1)
	public void EmployeeSection() throws InterruptedException {
		Object.Login("training@jalaacademy.com", "jobprogram");
		Thread.sleep(1000);
		Object2.EmployeeSection();
		Object2.EmployeeDataCreating("ali", "ahmed", "ahmed@gmail.com", "061516135163", "12/8/1999", "New Cairo");
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Search Employee");
		Object2.Search_Employee("ali", "061516135163");

	}

	@Test(priority = 2)
	public void filter() throws InterruptedException {
		Object2.Filter();

	}

	@Test(priority = 3)
	public void Orderd_Pages() throws InterruptedException {
		Object2.Pages();
	}

	@Test(priority = 4)
	public void Delete_Row() throws InterruptedException {
		Object2.DeleteRow();
	}

}
