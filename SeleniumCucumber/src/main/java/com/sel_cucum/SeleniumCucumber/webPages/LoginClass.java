package com.sel_cucum.SeleniumCucumber.webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginClass {
	
	public  WebDriver driver;
	
	public LoginClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Login']")
	public WebElement LoginButton;
	
	@FindBy(xpath="//input[@placeholder='Email / Phone Number']")
	public WebElement UserName;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Submit;
	
	

}
