package basics.demoQa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basics.framework.PageObject;

public class RadioButtonPage extends PageObject {
	protected RadioButtonPage(WebDriver driver, String baseUrl) {
		super(driver,baseUrl);
	}

	@FindBy(how=How.CSS, using="label[for='yesRadio']")
	private WebElement yesRadio;
	
	public RadioButtonPage clickYesRadioButton() {
		yesRadio.click();
		
		return this;
	}

	@FindBy(how=How.CSS, using="p.mt-3")
	private WebElement popup;
	
	public String getPopupText() {
		String popupText = popup.getText();
		return popupText;
	}
	
	@FindBy(how=How.CSS, using="label[for='impressiveRadio']")
	private WebElement impressiveRadio;
	
	public RadioButtonPage clickImpressiveRadioButton() {
		impressiveRadio.click();
		
		return this;
	}
}
