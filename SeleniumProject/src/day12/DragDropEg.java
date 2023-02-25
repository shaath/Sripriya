package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropEg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\SriPriyaRecordings/Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(5000);
		
		WebElement frame1 = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		
		Actions act1 = new Actions(driver);
		act1.dragAndDropBy(draggable, 404, 1).perform();
		
	}

}
