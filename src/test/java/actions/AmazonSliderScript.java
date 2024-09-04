package actions;

import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSliderScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wallets");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		WebElement lower_bound_slider = driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider"));
		WebElement upper_bound_slider = driver.findElement(By.id("p_36/range-slider_slider-item_upper-bound-slider"));
		
		for(;;) {
			lower_bound_slider.sendKeys(Keys.ARROW_RIGHT);
			if(lower_bound_slider.getAttribute("aria-valuetext").contains("10,"))
				break;
		}
		Thread.sleep(2000);
		for(;;) {
			upper_bound_slider.sendKeys(Keys.ARROW_LEFT);
			if(upper_bound_slider.getAttribute("aria-valuetext").contains("20,"))
				break;
		}
		driver.findElement(By.cssSelector("input.a-button-input")).click();
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(price);
		driver.quit();
	}

}
