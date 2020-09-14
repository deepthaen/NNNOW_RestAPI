package cucmberFrame.PraticeCucumber.stepDefinition;

import org.openqa.selenium.WebDriver;

import cucmberFrame.PraticeCucumber.implemention.WebImplemention;
import cucmberFrame.PraticeCucumber.webPage.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	public WebDriver driver;
	
	WebImplemention webimp = new WebImplemention();
	Login log ;
	
	public LoginStepDefination() {
		
		this.driver = webimp.launchBrowser();
		log = new Login(driver);
		
	}
	
	@Given("^User launch Browser$")
	public void launchingBrowser() throws Throwable{
		this.driver = webimp.launchBrowser();
	}
	
	@When("^User enter URL$")
	public void url() throws Throwable {
		webimp.getUrl();
	}
	
	@When("^User Enter Username \"({^\"]*)\" $")
	public void username(String username) {
		log.UserName.sendKeys(username);
	}
	
	@Then("^User Click on Contionue$")
	public void continoue() throws Throwable{
		log.Continue.click();
	}
	
	@When("^User Password \"([^\"]*)\"$")
	public void password(String password)throws Throwable {
		log.UserName.sendKeys(password);
	}
	
	@Then("^user click on Login$")
	public void loginbutton() throws Throwable{
		log.LoginButton.click();
		
	}

	
}
