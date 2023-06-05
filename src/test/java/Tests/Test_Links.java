package Tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Pages.Page_Links;
import Pages.Page_Login;

public class Test_Links extends Test_Basis {
	Page_Login Object_One = new Page_Login(driver);
	Page_Links Object_Two = new Page_Links(driver);

	@Test
	public void name() throws InterruptedException, IOException {
		Object_One.Login("training@jalaacademy.com", "jobprogram");
		Thread.sleep(3000);
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("The total of the links in the website" + Links.size());
		for (int i = 0; i < Links.size(); i++) {
			WebElement element = Links.get(i);
			String url = element.getAttribute("href");
			Verify_Link(url);
		}
	}

	public static void Verify_Link(String url_link) throws IOException {
		URL Link = new URL(url_link);
		HttpURLConnection httpconn = (HttpURLConnection) Link.openConnection();
		httpconn.setConnectTimeout(2000);
		httpconn.connect();
		if (httpconn.getResponseCode() == 200) {
			System.out.println(httpconn.getResponseMessage());
		}
		if (httpconn.getResponseCode() == 404) {
			System.out.println(httpconn.getResponseMessage());
		}

	}
}
