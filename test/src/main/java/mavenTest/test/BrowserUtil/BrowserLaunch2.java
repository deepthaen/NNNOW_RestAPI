package mavenTest.test.BrowserUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunch2 {
	
	public static WebDriver driver = null;
	
	public BrowserLaunch2() {
		this.driver = getInstance(); 
	}
	
	public static WebDriver getInstance() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL-E7470\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
			driver = new ChromeDriver(Capbalities());
		}
			return driver;
		
	}
	
	public static ChromeOptions Capbalities() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		return option;
	}
	
	
	
	

}
