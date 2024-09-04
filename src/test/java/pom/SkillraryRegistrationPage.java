package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryRegistrationPage {

	@FindBy(name = "firstname")
	private WebElement firstNameTF;

	@FindBy(name = "lastname")
	private WebElement lastNameTF;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailTF;

	@FindBy(xpath = "(//input[@placeholder='Password'])[2]")
	private WebElement passwordTF;

	@FindBy(name = "repassword")
	private WebElement confirmPWDTF;

	@FindBy(partialLinkText = "membership")
	private WebElement alreadyHaveMembershipLink;

	@FindBy(xpath = "//a[text()=' Home']")
	private WebElement homeLink;

	@FindBy(name = "signup")
	private WebElement registerBTN;
	
	public SkillraryRegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setFirstName(String firstName) {
		firstNameTF.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		lastNameTF.sendKeys(lastName);
	}
	
	public void setEmail(String email) {
		emailTF.sendKeys(email);
	}
	
	public void setPassword(String password) {
		passwordTF.sendKeys(password);
	}
	
	public void setConfirmPassword(String confirmPWD) {
		confirmPWDTF.sendKeys(confirmPWD);
	}
	
	public void clickAlreadyHaveMembership() {
		alreadyHaveMembershipLink.click();
	}
	
	public void clickHome() {
		homeLink.click();
	}
	
	public void clickRegister() {
		registerBTN.click();
	}
}
