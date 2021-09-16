package basics.pageObjects.ampegPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basics.pageObjects.PageObject;

public class AmpegClassicSeriesSvt410HlfProductPage extends PageObject {

	protected AmpegClassicSeriesSvt410HlfProductPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String getHandlingWeightSpecification() {		
		String weight = this.driver.findElement(By.cssSelector("div.specsCopy")).getText();
		String[] specs = weight.split("\n");
		
		String handlingWeight = specs[specs.length-1];
		
		return handlingWeight;
	}

}
