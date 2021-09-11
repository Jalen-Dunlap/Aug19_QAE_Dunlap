package basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {

	@Test
	public void canLaunchWebDriver() {
		String chromeDriverPath = "C:\\\\Users\\jjina\\Desktop\\Quintrix_Training\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		String url = "https://www.selenium.dev/";
		
		driver.navigate().to(url);
		String currentUrl = driver.getCurrentUrl();
		
		assertTrue("Did not navigate to the correct url", currentUrl.equals(url));
	}	
}
