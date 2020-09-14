package cucmberFrame.PraticeCucumber.webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;
	
	public Login(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Login']")
	public WebElement LoginButton;
	
	@FindBy(xpath="//input[@name='mobile number']")
	public WebElement UserName;
	
	@FindBy(xpath="//button[@class='nwc-btn nwc-btn-primary nw-login-btn nw-loginv2-submitbtn'])")
	public WebElement Continue;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Submit;
	
}
