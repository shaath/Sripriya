package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunchEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\SriPriyaRecordings\\Jars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://primusbank.qedgetech.com");
	}

}
