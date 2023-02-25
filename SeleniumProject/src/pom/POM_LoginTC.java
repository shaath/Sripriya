package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM_LoginTC {

	@Test
	public void login() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		driver.get(lp.url);
		lp.orgLogin(lp.u, lp.p);
		Thread.sleep(5000);
		
		AdminhomePage ap = PageFactory.initElements(driver, AdminhomePage.class);
		ap.WelcomeClick();
		ap.LogoutClick();
		
		driver.close();
	}
}
