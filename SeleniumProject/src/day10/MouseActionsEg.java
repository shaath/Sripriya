package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		Thread.sleep(7000);
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(gmail).perform();
//		Thread.sleep(5000);
//		act.contextClick().perform();
//		Thread.sleep(5000);
		act.moveToElement(gmail).contextClick().build().perform();
	}

}
