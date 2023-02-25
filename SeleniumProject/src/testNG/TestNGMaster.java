package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import methods.GenericMethods;

public class TestNGMaster extends GenericMethods {
	public GenericMethods gm;
	public String expval, actval;
	public FileInputStream fi;
	public Properties pr;
	public String br = "firefox", url = "https://orangehrm.qedgetech.com";
	public String u = "Admin", p = "Qedge123!@#";
	public String f = "Ishan", l = "Jonnala", empId = "IJ3765";
	public String ename = f+" "+l, uname = "AAAAA"+f+l+"322", pwd = "Test@5432167890";
	
	@BeforeSuite
	public void orgLaunch() throws IOException{
		fi = new FileInputStream("D:\\SriPriyaRecordings\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\properties\\OrgHRMProperties.properties");
		pr = new Properties();
		pr.load(fi);
		expval = "LOGIN";
		gm = new GenericMethods();
		gm.BrLaunch(br, url);
		
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		Assert.assertEquals(actval, expval, "Launch Failed");
	}
	
	@BeforeTest
	public void orgLogin() throws InterruptedException{
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		Thread.sleep(5000);
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval, "Login Failed");
	}
	
	@AfterTest
	public void orgLogout() throws InterruptedException{
		expval = "LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval, "Logout Failed");
	}
	
	@AfterSuite
	public void orgClose(){
		driver.close();
	}
}
