package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radios = driver.findElements(By.xpath("(//td[@class='table5'])[2]/input"));
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) {
			String rText = radios.get(i).getAttribute("value");
			System.out.println(rText);
			
//			if (rText.equalsIgnoreCase("Milk")) {
//				radios.get(i).click();
//			}else if (rText.equalsIgnoreCase("Water")) {
//				radios.get(i).click();
//			}
			
			if (rText.equalsIgnoreCase("Milk") || rText.equalsIgnoreCase("Water")) {
				radios.get(i).click();
			}
			
		}

	}

}
