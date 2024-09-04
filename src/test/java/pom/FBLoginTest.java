package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FBLoginPage login = new FBLoginPage(driver);
		login.setEmail("hjgkjhlkjksdfdrghr");
		login.setPassword("ghgjhnbvhjnhkbjm");
		login.clickLogin();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
