package basics.demoQa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basics.framework.PageObject;

public class LinksPage extends PageObject {
	public LinksPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	@FindBy(how=How.CSS, using="a#simpleLink")
	private WebElement homeLink;

	public DemoQaHomePage clickHomeLink() {
		homeLink.click();
		
		String[] windows = driver.getWindowHandles().toArray(new String[4]);
		driver.switchTo().window(windows[1]);
		
		return new DemoQaHomePage(this.driver,this.baseUrl);
	}

	@FindBy(how=How.CSS, using="a#created")
	private WebElement createdLink;
	
	public LinksPage clickCreatedLink() {
		createdLink.click();
		return this;
	}

	@FindBy(how=How.CSS, using="p#linkResponse")
	private WebElement responseText;
	
	public String getResponseText() {
		String response = responseText.getText();
		return response;
	}
}
