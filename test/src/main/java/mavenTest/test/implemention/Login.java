package mavenTest.test.implemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenTest.test.Utilies.PropertyUtil;


public class Login  {
	
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
	
	 public void Login() {
		String s =  driver.getCurrentUrl();
		System.out.println(s);
		 LoginButton.click();
		 String UN = PropertyUtil.getProperty("UserName");
			System.out.println("Username"+ UN);
			UserName.sendKeys(UN);
			Continue.click();
			String PW = PropertyUtil.getProperty("Password");
			Password.sendKeys(PW);
			Submit.click();
		
		 
	 }


}
