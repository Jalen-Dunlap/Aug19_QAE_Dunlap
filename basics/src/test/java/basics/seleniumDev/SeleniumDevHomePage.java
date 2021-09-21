package basics.seleniumDev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDevHomePage {
	private WebDriver driver;
	private String baseUrl;

	public SeleniumDevHomePage(WebDriver driver, String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;		
		
		
	}

	public WebDriverDocumentationPage clickReadMoreButtonSeleniumWebDriver() {
		long elementToBeClickableTimeoutSeconds = 5;
		WebElement button = this.driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']/ancestor::div[@class='card h-100 border-0 bg-transparent']//a"));
		WebDriverWait wait = new WebDriverWait(this.driver, elementToBeClickableTimeoutSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		
		return new WebDriverDocumentationPage(this.driver,this.baseUrl);
	}

}
