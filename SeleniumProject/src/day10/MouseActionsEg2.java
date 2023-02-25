package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(360));
		WebElement signin = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(signin).perform();
		driver.findElement(By.xpath("//span[text()='Your Orders']")).click();
//		WebElement yo = driver.findElement(By.xpath("//span[text()='Your Orders']"));
//		act.click(yo).perform();

	}

}
