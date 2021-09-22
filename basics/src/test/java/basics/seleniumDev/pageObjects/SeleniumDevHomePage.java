package basics.seleniumDev.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumDevHomePage {
	private WebDriver driver;
	private String baseUrl;

	public SeleniumDevHomePage(WebDriver driver, String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;		
		
		
	}

	public WebDriverDocumentationPage clickReadMoreButtonSeleniumWebDriver() {
		WebElement button = this.driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']/ancestor::div[@class='card h-100 border-0 bg-transparent']//a"));
		button.click();
		
		return new WebDriverDocumentationPage(this.driver,this.baseUrl);
	}

}
