package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitwaitEg {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://Amazon.in");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(360));
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();

	}

}
