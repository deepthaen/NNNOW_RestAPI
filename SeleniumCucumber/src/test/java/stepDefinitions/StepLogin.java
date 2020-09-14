package stepDefinitions;

public class StepLogin {
	
	
	public StepLogin() {
		
	}
	

	@When("^user logs in$")
	public void Login() {
		object.log.click()
	}
	
	@Given("^ data for a username and password "([^\"]*)" and "([^\"]*)$")
			public void enteruser (String username, String paswword) {
		login.username.sendkeys(username);
		login.password.sendk
	}
}
