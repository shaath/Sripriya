package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");

		WebElement email = driver.findElement(By.id("identifierId"));
//		email.click();
//		Thread.sleep(5000);
		email.sendKeys("sharathchandratesting");
		Thread.sleep(3000);
//		email.clear();
		driver.findElement(By.id("identifierNext")).click();
		
	}

}
