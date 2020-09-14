package com.sel_cucum.SeleniumCucumber.webUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserUtils {
	
	public static WebDriver driver; 
	
	public BrowserUtils() {
		this.driver = getInstance();
	}
	
	public static WebDriver getInstance() {
		if(driver == null) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL-E7470\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		driver = new ChromeDriver(options());
		
	}
	return driver;
}

public static ChromeOptions  options() {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	return option;
	}


}
