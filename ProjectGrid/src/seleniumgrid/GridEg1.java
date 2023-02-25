package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class GridEg1 {

	@Parameters({"Browser", "Plotform"})
	@Test
	public void grid(String br, String pt) throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		if (br.equalsIgnoreCase("firefox") && pt.equalsIgnoreCase("Windows")) {
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}else if (br.equalsIgnoreCase("chrome") && pt.equalsIgnoreCase("Windows")) {
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}else if (br.equalsIgnoreCase("MicrosoftEdge") && pt.equalsIgnoreCase("Windows")) {
			cap.setBrowserName("MicrosoftEdge");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.8:4444"), cap);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Logout")).click();

		driver.close();
	}
}
