package basics.seleniumDev.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverDocumentationPage{
	private String baseUrl;
	private String url = "documentation/webdriver/";
	public String fullUrl;
	private WebDriver driver;

	public WebDriverDocumentationPage(WebDriver driver,String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;
		this.fullUrl = this.baseUrl + this.url;
	}
	
	public UnderstandingTheComponentsPage clickUnderstandingTheComponentsLink() {
		WebElement link = driver.findElement(By.linkText("Understanding the components"));
		link.click();
		
		return new UnderstandingTheComponentsPage(this.driver, this.baseUrl);
	}
}
