package mavenTest.test.implemention;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Listing {
	
	public WebDriver driver;
	
	public Listing(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'WOMEN')]")
	public WebElement WomenCategory;
	
	@FindBy(xpath="//*[text()='Tops & T-Shirts']")
	public WebElement TshirtSubCategory;
	
	@FindBy(xpath="//div[@class='nw-productview-producttitle']\"")
	public WebElement FirstProduct ;
	
	public void hoverCategory() {
		Actions action = new Actions(driver);
		//WebElement hover = driver.findElement(By.xpath("//span[contains(text(),'WOMEN')]"));
		action.moveToElement(WomenCategory).build().perform();
	}
	
	public void  subCategory() {
		TshirtSubCategory.click();
	}
	
	public void listpage() {
		String currentWindow = driver.getWindowHandle();
		Actions baction = new Actions(driver);
		baction.moveToElement(FirstProduct)
		.click(FirstProduct).build().perform();
		

		Set<String> windows =driver.getWindowHandles();

		// windows().iterator().next();
		for (String s : windows) {
			if(!s.equals(currentWindow))
			{
				driver.switchTo().window(s);
			}
		}

	}

	public void LisitngFunctionality() {
		hoverCategory();
		subCategory();
		listpage();
	}

	

}
