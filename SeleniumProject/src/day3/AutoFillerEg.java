package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoFillerEg {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\SriPriyaRecordings\\Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("Sh");
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));

		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i).getText();
			System.out.println(name);
			
			if (name.equalsIgnoreCase("Shimla")) {
				list.get(i).click();
				break;
			}
		}
	}

}
