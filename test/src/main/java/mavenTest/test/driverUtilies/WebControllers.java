package mavenTest.test.driverUtilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface  WebControllers {

	
	WebDriver launchBrowser();
	void waits();
	void getUrl();
	void max();
	void mouseHover(WebElement element);
	void scrollBottom(WebElement element);
	void scrollUp(WebElement element);
	void TakeScreenshot();
	void quite();
	
}
