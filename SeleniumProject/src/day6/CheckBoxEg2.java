package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement> checks = driver.findElements(By.xpath("//input[contains(@name, 'option')]"));
		System.out.println(checks.size());
		
		for (int i = 0; i < checks.size(); i++) {
			String cValue = checks.get(i).getAttribute("value");
			System.out.println(cValue);
			
			if (!checks.get(i).isSelected() && (cValue.equalsIgnoreCase("Milk") || cValue.equalsIgnoreCase("Cheese"))) {
				checks.get(i).click();
			}
		}

	}

}
