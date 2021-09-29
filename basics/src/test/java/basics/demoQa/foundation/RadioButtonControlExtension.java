package basics.demoQa.foundation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonControlExtension {

	private WebElement mappedElement;

	private WebElement selectedElement;

	public RadioButtonControlExtension(WebElement element) {
		this.mappedElement = element;
	}

	public void select(String label) {
		selectedElement = mappedElement.findElement(By.xpath(".//*[text()='"+label+"']/."));
		selectedElement.click();
	}

	public String getSelected() {
		return selectedElement.getText();
	}
}
