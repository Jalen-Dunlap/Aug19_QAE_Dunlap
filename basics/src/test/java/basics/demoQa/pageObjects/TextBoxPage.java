package basics.demoQa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basics.framework.PageObject;

public class TextBoxPage extends PageObject {
	public TextBoxPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	@FindBy(how=How.CSS, using="input#userName")
	private WebElement userNameBox;

	@FindBy(how=How.CSS, using="input#userEmail")
	private WebElement emailBox;

	@FindBy(how=How.CSS, using="textArea#currentAddress")
	private WebElement currentAddressBox;

	@FindBy(how=How.CSS, using="textArea#permanentAddress")
	private WebElement permanentAddressBox;

	@FindBy(how=How.CSS, using="button#submit")
	private WebElement submit;	
	
	@FindBy(how=How.CSS, using="p#name")
	private WebElement labelName;
	
	@FindBy(how=How.CSS, using="p#currentAddress")
	private WebElement labelcurAddress;
	
	@FindBy(how=How.CSS, using="p#permanentAddress")
	private WebElement labelPermAddress;
	
	@FindBy(how=How.CSS, using="p#email")
	private WebElement labelEmail;
	
	public TextBoxPage enterUserName(String name) {
		userNameBox.sendKeys(name);

		return this;
	}

	public TextBoxPage enterEmail(String email) {
		emailBox.sendKeys(email);

		return this;
	}

	public TextBoxPage enterCurrentAddress(String curAddress) {
		currentAddressBox.sendKeys(curAddress);

		return this;
	}

	public TextBoxPage enterPermanentAddress(String permAddress) {
		permanentAddressBox.sendKeys(permAddress);

		return this;
	}
	
	public TextBoxPage clickSubmit() {
		submit.click();

		return this;
	}

	public String getLabelName() {
		String name = labelName.getText();
		return name;
	}

	public String getEmail() {
		String email = labelEmail.getText();
		return email;
	}
	
	public String getCurrentAddress() {
		String curAddress = labelcurAddress.getText();
		return curAddress;
	}

	public String getPermanentAddress() {
		String permAddress = labelPermAddress.getText();
		return permAddress;
	}
}
