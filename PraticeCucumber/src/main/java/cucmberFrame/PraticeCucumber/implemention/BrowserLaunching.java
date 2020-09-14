package cucmberFrame.PraticeCucumber.implemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunching {
	
	public static WebDriver driver = null;
	
	public BrowserLaunching() {
		this.driver = getIntansce();
		
	}
	
	public static WebDriver getIntansce() {
		if(driver == null) {
			System.setProperty("webdriver.Chrome.driver", "C:\\Users\\DELL-E7470\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
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
