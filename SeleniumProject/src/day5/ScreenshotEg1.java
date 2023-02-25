package day5;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotEg1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://bing.com");
		Thread.sleep(20000);
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File src = driver.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("D:\\SriPriyaRecordings\\Workspace\\SeleniumProject\\src\\screenshots/bing.png"));
		
//		File src = driver.getFullPageScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("D:\\SriPriyaRecordings\\Workspace\\SeleniumProject\\src\\screenshots/bing_full_page.png"));

		File src = driver.findElement(By.xpath("//span[@id='id_s']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\SriPriyaRecordings\\Workspace\\SeleniumProject\\src\\screenshots/sign_in.jpg"));
	}

}
