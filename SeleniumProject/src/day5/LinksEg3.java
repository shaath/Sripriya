package day5;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
		List<WebElement> links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			String lName = links.get(i).getText();
			System.out.println(lName);
			links.get(i).click();
			Thread.sleep(5000);
			System.out.println("Title: "+driver.getTitle()+" URL: "+driver.getCurrentUrl());
			
			File src = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\SriPriyaRecordings\\Workspace\\SeleniumProject\\src\\screenshots/"+lName+".png"));
			
			driver.navigate().back();
			Thread.sleep(3000);
			links = driver.findElements(By.xpath("//table[@id='Table_011']//a"));
			}
		}

}
