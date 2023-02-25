package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarEg1 {

	public static void main(String[] args) throws InterruptedException {
		
		String date = "30-March-2023";
		String[] split = date.split("-");
		String date_month = split[1]+" "+split[2];
		String day = split[0];
		if (day.length() == 1) {
			day = "0"+day;
		}
		System.out.println(date_month+"------"+day);
		
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[local-name()='svg' and @class=' c-pointer c-neutral-900']")).click();
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(5000);
		WebElement cal = driver.findElement(By.xpath("//*[local-name()='mask' and @id='mask0_985_9207']/../.."));
		cal.click();
		Thread.sleep(5000);
		
		String month_year = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
		while (!month_year.equalsIgnoreCase(date_month)) {
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow']")).click();
			month_year = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
		}
		
		List<WebElement> days = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Day' or contains(@class, 'Edge')]"));
		for (int i = 1; i < days.size()-1; i++) {
			String d = days.get(i).getAttribute("aria-label");
			System.out.println(d);
			String dd = d.split(" ")[2];
			if (d.split(" ")[2].length() == 1) {
				dd = "0"+d.split(" ")[2]; 
			}
			if (dd.equals(day)) {
				days.get(i).click();
				break;
			}
		}
	}

}
