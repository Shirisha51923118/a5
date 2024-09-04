package crossBrowserParallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test1 extends BaseClass {

	@Test 
	public void swiggyTest() {
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo = driver.findElement(By.cssSelector("svg._8pSp-"));
		if(logo.isDisplayed())
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}
