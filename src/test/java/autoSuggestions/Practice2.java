package autoSuggestions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class, 's-suggestion-ellipsis-direction') and contains(., 'toys')]"));
		List<String> text = new ArrayList<String>();
		for (WebElement e : list) {
			text.add(e.getText());
			System.out.println(e.getText());
		}
		System.out.println("---------------------------------------------------");
		Collections.sort(text);
		for (String string : text) {
			System.out.println(string);
		}
		driver.quit();
	}

}
