package basics.demoQa.foundation;

import org.openqa.selenium.WebElement;

public class TextBoxControlExtension {

	private WebElement mappedElement;

	public TextBoxControlExtension(WebElement element) {
		this.mappedElement = element;
	}
	
	public String getValue() {
		String value = mappedElement.getAttribute("value");
		return value;
	}
	
	public void setValue(String value) {
		mappedElement.sendKeys(value);
		if(!getValue().equals(value)) {
			setValue(value);
		}
	}
}
