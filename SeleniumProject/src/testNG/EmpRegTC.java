package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpRegTC extends TestNGMaster{

	@Test(dataProvider = "data")
	public void orgEmpReg(String f, String l, String empId){
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(empId);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data(){
		Object[][] x = new Object[4][3];
		
		x[0][0] = "Arjun";
		x[0][1] = "Jonnala";
		x[0][2] = "AJ854760";
		
		x[1][0] = "Harsha";
		x[1][1] = "Jonnala";
		x[1][2] = "HJ854760";
		
		x[2][0] = "Srihan";
		x[2][1] = "Jonnala";
		x[2][2] = "SJ854760";
		
		x[3][0] = "Shourya";
		x[3][1] = "Jonnala";
		x[3][2] = "WJ854760";
		
		return x;
	}
}
