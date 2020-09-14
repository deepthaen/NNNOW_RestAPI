package cucmberFrame.PraticeCucumber.implemention;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucmberFrame.PraticeCucumber.controllers.NNNow;


public class WebImplemention implements NNNow{
	
	public WebDriver driver;
	
	public WebDriver launchBrowser() {
		this.driver = BrowserLaunching.getIntansce();
		System.out.println("Browser launching");
		return driver;
	}
	
	
	public void getUrl() {
		driver.get("https://nnnow.com");
		System.out.println("Fetching url");
		
	}

	public void max() {
		driver.manage().window().maximize();
		System.out.println("Max window");
	}

	public void waitforpage() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Waiting");
		
	}

	public void quite() {
		driver.quit();
		System.out.println("closing window");
		
	}

	

}
