package mavenTest.test.implemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDP {
	
	public WebDriver driver;
	
	public PDP(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[contains(text(),'XXS')]")
	public WebElement Size;
	
	@FindBy(xpath="//div[contains(@class,'nw-color-block')]//a[1]")
	public WebElement Colour;
	
	@FindBy(xpath="//button[contains(@class,'nwc-btn nwc-ripple-container nwc-btn-primary nw-pdp-addtobag')]")
	public WebElement AddToBag;
	
	
	public void Pdp() {
		Size.click();
		Colour.click();
		AddToBag.click();
	}

}
