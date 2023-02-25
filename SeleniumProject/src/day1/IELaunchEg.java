package day1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunchEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\SriPriyaRecordings\\Jars\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();

		driver.get("https://youtube.com");
	}

}
