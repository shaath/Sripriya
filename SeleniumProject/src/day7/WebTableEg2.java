package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		Thread.sleep(5000);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(5000);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) {
//			System.out.println(rows.get(i).getText());
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));	
			String id = cols.get(1).getText();
			System.out.println(id);
			if (id.equals("10331")) {
				cols.get(0).click();
				Thread.sleep(3000);
				driver.findElement(By.id("btnDelete")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("dialogDeleteBtn")).click();
				Thread.sleep(3000);
				break;
			}
			
		}
		
//		List<WebElement> checks = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord')]"));
//		for (int i = 0; i < checks.size(); i++) {
//			checks.get(i).click();
//		}
	}

}
