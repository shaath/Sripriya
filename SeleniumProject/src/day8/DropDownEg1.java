package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");

		WebElement skills = driver.findElement(By.id("Skills"));
		Select s = new Select(skills);
		s.selectByIndex(4);
		Thread.sleep(5000);
		s.selectByValue("AutoCAD");
		Thread.sleep(5000);
		s.selectByVisibleText("Data Analytics");
	}

}
