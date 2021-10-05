package basics.demoQa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basics.demoQa.foundation.RadioButtonControlExtension;
import basics.framework.PageObject;

public class RadioButtonPage extends PageObject {
	public RadioButtonPage(WebDriver driver, String baseUrl) {
		super(driver,baseUrl);
	}
	
	@FindBy(how=How.CSS, using="p.mt-3")
	private WebElement popup;

	@FindBy(how=How.XPATH, using="//div[@class='mb-3']/../.")
	private WebElement radioGroupDiv;
	
	private RadioButtonControlExtension radioGroup = getRadioGroup();
	
	public RadioButtonPage clickYesRadioButton() {
		radioGroup.select("Yes");

		return this;
	}

	public String getPopupText() {
		String popupText = popup.getText();
		return popupText;
	}

	public RadioButtonPage clickImpressiveRadioButton() {
		radioGroup.select("Impressive");
		return this;
	}
	
	private RadioButtonControlExtension getRadioGroup() {
		return new RadioButtonControlExtension(radioGroupDiv);
	}
}
