package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement twitter = driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		
		Actions actions = new Actions(driver);
		actions.scrollToElement(twitter).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
