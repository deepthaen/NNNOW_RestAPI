package mavenTest.test.functional;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mavenTest.test.BrowserUtil.BrowserLaunch;
import mavenTest.test.driverUtilies.WebControllers;
import mavenTest.test.implemention.Checkout;
import mavenTest.test.implemention.Listing;
import mavenTest.test.implemention.Login;
import mavenTest.test.implemention.PDP;
import mavenTest.test.implemention.WebImplemention;

public class LoginFunctionality {
	public WebDriver driver;
	
	
	public Login Log;
	public Listing Lis;
	public PDP pdp;
	public Checkout check;
	
	
	
	public WebControllers w;
	public LoginFunctionality() {
		w = new WebImplemention();
		this.driver  = w.launchBrowser();
		
	}
	
	@BeforeMethod
	public void BrowLaunch() {
		
		w.getUrl();
		w.max();
		w.waits();
		String U = driver.getCurrentUrl();
		System.out.println(U);
	}

	@Test
	public void FunctionalLogin() {
		
		Log = new Login(driver);
		
		Log.Login();
		Lis.LisitngFunctionality();
		pdp.Pdp();
		check.CheckountFunctionality();
	}
	
	@BeforeMethod
	public void CloseBroweser() {
	w.quite();
}
}