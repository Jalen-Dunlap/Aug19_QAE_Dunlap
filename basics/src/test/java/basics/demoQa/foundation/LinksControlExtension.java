package basics.demoQa.foundation;

import org.openqa.selenium.WebElement;

public class LinksControlExtension {
	
	private WebElement mappedElement;

	public LinksControlExtension(WebElement element) {
		this.mappedElement = element;
	}
	
	public void click() {
		mappedElement.click();
	}
}
