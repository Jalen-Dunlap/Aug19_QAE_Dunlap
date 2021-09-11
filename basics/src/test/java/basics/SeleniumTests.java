package basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTests {
	final String WEB_DRIVER_SYSTEM_PROPERTY = "webdriver.chrome.driver";
	
	@Test
	public void canLaunchWebDriver() {
		String chromeDriverPath = "C:\\\\Users\\jjina\\Desktop\\Quintrix_Training\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY,chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		String url = "https://www.selenium.dev/";
		
		driver.navigate().to(url);
		String currentUrl = driver.getCurrentUrl();
		
		assertTrue("Did not navigate to the correct url", currentUrl.equals(url));
		
		driver.quit();
	}	
	
	@Test
	public void canShowExplicitWait() {
		String chromeDriverPath = "C:\\\\Users\\jjina\\Desktop\\Quintrix_Training\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY, chromeDriverPath);
		String baseUrl = "https://www.selenium.dev/";
		String documentationPageUrl = baseUrl + "documentation/webdriver/";
		long elementToBeClickableTimeoutSeconds = 5;
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(baseUrl);
		WebElement button = driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']/ancestor::div[@class='card h-100 border-0 bg-transparent']//a"));
		WebDriverWait wait = new WebDriverWait(driver, elementToBeClickableTimeoutSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		String currentUrl = driver.getCurrentUrl();
		
		assertTrue("Did not navigate to the url " + documentationPageUrl, currentUrl.equals(documentationPageUrl));
	
		driver.quit();
	}
}
