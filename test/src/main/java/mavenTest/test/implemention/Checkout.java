package mavenTest.test.implemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
	public WebDriver driver;
	
	public Checkout(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='CHECKOUT']")
	public WebElement ConitnuePDP;
	
	@FindBy(xpath="//*[text()='CONTINUE']")
	public WebElement CheckoutButton;
	

	public void CheckountFunctionality() {
		ConitnuePDP.click();
		CheckoutButton.click();
	}
}
