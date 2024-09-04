package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement block2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions actions = new Actions(driver);
		//actions.dragAndDrop(block2, block4).perform();
		
		actions.clickAndHold(block2).moveToElement(block4).release().build().perform();
		Thread.sleep(2000);
		driver.quit();		
	}

}
