package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(5000);
        WebElement skills = driver.findElement(By.id("Skills"));
		Select s = new Select(skills);
		
		List<WebElement> dropList = s.getOptions();
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) {
//			s.selectByIndex(i);
//			String txt = dropList.get(i).getText();
//			System.out.println(txt);
//			
//			s.selectByVisibleText(txt);
			
			String value = dropList.get(i).getAttribute("value");
			s.selectByValue(value);
		}

	}

}
