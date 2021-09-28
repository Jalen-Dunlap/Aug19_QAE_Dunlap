package basics.demoQa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basics.framework.PageObject;

public class RadioButtonPage extends PageObject {
	public RadioButtonPage(WebDriver driver, String baseUrl) {
		super(driver,baseUrl);
	}

	@FindBy(how=How.CSS, using="label[for='yesRadio']")
	private WebElement yesRadio;
	
	@FindBy(how=How.CSS, using="p.mt-3")
	private WebElement popup;

	@FindBy(how=How.CSS, using="label[for='impressiveRadio']")
	private WebElement impressiveRadio;
	
	public RadioButtonPage clickYesRadioButton() {
		yesRadio.click();

		return this;
	}

	public String getPopupText() {
		String popupText = popup.getText();
		return popupText;
	}

	public RadioButtonPage clickImpressiveRadioButton() {
		impressiveRadio.click();

		return this;
	}
}
