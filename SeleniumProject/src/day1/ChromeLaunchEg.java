package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SriPriyaRecordings\\Jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com");
	}

}
