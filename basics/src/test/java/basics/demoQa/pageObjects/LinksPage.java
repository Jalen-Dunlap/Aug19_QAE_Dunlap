package basics.demoQa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basics.demoQa.foundation.LinksControlExtension;
import basics.framework.PageObject;

public class LinksPage extends PageObject {
	public LinksPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	@FindBy(how=How.CSS, using="a#simpleLink")
	private WebElement homeLink;
	
	@FindBy(how=How.CSS, using="a#created")
	private WebElement createdLink;

	@FindBy(how=How.CSS, using="p#linkResponse")

	private WebElement responseText;

	public DemoQaHomePage clickHomeLink() {
		linksControl(homeLink).click();
		
		goToNewestTab(getWindowsSize());

		return new DemoQaHomePage(this.driver,this.baseUrl);
	}

	public LinksPage clickCreatedLink() {
		linksControl(createdLink).click();
		return this;
	}

	public String getResponseText() {
		String response = responseText.getText();
		return response;
	}
	
	private int getWindowsSize() {
		return this.driver.getWindowHandles().size();
	}
	
	private void goToNewestTab(int tabs) {
		String[] windows = this.driver.getWindowHandles().toArray(new String[tabs+1]);
		driver.switchTo().window(windows[tabs+1]);
	}
	
	private LinksControlExtension linksControl(WebElement link) {
		return new LinksControlExtension(link);
	}
}
