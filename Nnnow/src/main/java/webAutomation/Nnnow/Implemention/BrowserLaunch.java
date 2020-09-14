package webAutomation.Nnnow.Implemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunch {
	
	public static WebDriver driver = null;
	
	public BrowserLaunch() {
		
	}
	
	public static WebDriver getInstance() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL-E7470\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		driver = new ChromeDriver(capabilities());
		}
		return driver;
		
	}
	
	public static ChromeOptions capabilities() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		return option;
		
	}
	
	

}
