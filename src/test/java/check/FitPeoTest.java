package check;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FitPeoTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
		for(;;) {
			if(slider.getAttribute("aria-valuenow").equals("820"))
				break;
			slider.sendKeys(Keys.ARROW_RIGHT);
		}
		
		WebElement input = driver.findElement(By.cssSelector("input.MuiInputBase-input"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(input).perform();
		input.click();
		input.clear();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=560", input);
		
		Thread.sleep(2000);
		driver.quit();		
	}
}
