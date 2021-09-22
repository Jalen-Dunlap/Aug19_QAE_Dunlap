package basics.seleniumDev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UnderstandingTheComponentsPage {
	private WebDriver driver;
	private String baseUrl;

	public UnderstandingTheComponentsPage(WebDriver driver, String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;
	}
	
	public SeleniumDevHomePage clickSeleniumLogo() {
		WebElement homePageLink = driver.findElement(By.id("selenium_logo"));
		homePageLink.click();
		
		return new SeleniumDevHomePage(this.driver, this.baseUrl);
	}
}
