package crossBrowserParallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test2 extends BaseClass {
	
	@Test 
	public void primeVideoTest() {
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement header = driver.findElement(By.xpath("//h1[text()='Welcome to Prime Video']"));
		if(header.isDisplayed())
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}
