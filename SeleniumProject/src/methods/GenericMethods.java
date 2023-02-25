package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenericMethods {
	public static WebDriver driver;
	public void BrLaunch(String br, String url){
		if (br.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if (br.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\SriPriyaRecordings\\Jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (br.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\SriPriyaRecordings\\Jars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if (br.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\SriPriyaRecordings\\Jars\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get(url);
	}
}
