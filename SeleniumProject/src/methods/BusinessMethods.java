package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessMethods extends GenericMethods{
	public GenericMethods gm;
	public String expval, actval;
	public FileInputStream fi;
	public Properties pr;
	//Launch
	public String OrgLaunch(String br, String url) throws IOException{
		fi = new FileInputStream("D:\\SriPriyaRecordings\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\properties\\OrgHRMProperties.properties");
		pr = new Properties();
		pr.load(fi);
		expval = "LOGIN";
		gm = new GenericMethods();
		gm.BrLaunch(br, url);
		
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		if (expval.equals(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Login
	public String OrgLogin(String u, String p) throws InterruptedException{
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		Thread.sleep(5000);
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		if (expval.equals(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	//Logout
	public String OrgLogout() throws InterruptedException{
		expval = "LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		if (expval.equals(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	//Close
	public void OrgClose(){
		driver.close();
	}
	//Employee Reg
	public String OrgEmpReg(String f, String l, String empId){
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(empId);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		if (expval.equals(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}	
	}
	//User Reg
	public String OrguserReg(String ename, String uname, String pwd){
		boolean flag = false;
		expval = uname;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(360));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("btnAdd")))).click();
//		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> un = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]/a"));
		for (int i = 0; i < un.size(); i++) {
			String actval = un.get(i).getText();
			if (actval.equalsIgnoreCase(expval)) {
				flag= true;
				break;
			}
		}
		if (flag == true) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
}
