package basics.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basics.seleniumDev.*;

public class SeleniumTests {
	final String WEB_DRIVER_SYSTEM_PROPERTY = "webdriver.chrome.driver";
	private WebDriver driver;
	private String baseUrl = "https://www.selenium.dev/";
	
	@Before
	public void setup() {
		String chromeDriverPath = "C:\\\\Users\\jjina\\Desktop\\Quintrix_Training\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY,chromeDriverPath);
		
		this.driver = new ChromeDriver();
		this.driver.navigate().to(this.baseUrl);
	}
	
	@Test
	public void canLaunchWebDriver() {
		String currentUrl = this.driver.getCurrentUrl();
		
		assertTrue("Did not navigate to the correct url", currentUrl.equals(this.baseUrl));
	}	
	
	@Test
	public void canShowExplicitWait() {
		WebDriverDocumentationPage page = new SeleniumDevHomePage(this.driver,this.baseUrl)
				.clickReadMoreButtonSeleniumWebDriver();
		
		String currentUrl = driver.getCurrentUrl();
		
		assertTrue("Did not navigate to the url " + page.fullUrl, page.fullUrl.equals(currentUrl));
	}
	
	@Test
	public void canDemoPageObjectPattern() {
				new SeleniumDevHomePage(this.driver, this.baseUrl)
				.clickReadMoreButtonSeleniumWebDriver()
				.clickUnderstandingTheComponentsLink()
				.clickSeleniumLogo();
	}
	
	@After
	public void cleanup() {
		this.driver.quit();
	}
}
