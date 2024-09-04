package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryRegistrationTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SkillraryRegistrationPage register = new SkillraryRegistrationPage(driver);
		register.setFirstName("ABCD");
		register.setLastName("XYZ");
		register.setEmail("abcd_xyz@gmail.com");
		register.setPassword("abcd@xyz#123");
		register.setConfirmPassword("abcd@xyz#123");
		register.clickRegister();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
