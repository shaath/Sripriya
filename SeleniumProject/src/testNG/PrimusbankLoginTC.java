package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimusbankLoginTC {

	WebDriver driver = null;
	@BeforeClass
	public void brLaunch(){
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@BeforeMethod
	public void appLaunch() throws InterruptedException{
		driver.get("http://primusbank.qedgetech.com");
		Thread.sleep(5000);
	}
	
	@Test(priority=0)
	public void appLogin() throws InterruptedException{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void appBrachClick() throws InterruptedException{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void appLogout() throws InterruptedException{
		driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void appClose(){
		driver.close();
	}
}
