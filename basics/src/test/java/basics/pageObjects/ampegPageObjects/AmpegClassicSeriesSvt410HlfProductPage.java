package basics.pageObjects.ampegPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basics.pageObjects.PageObject;

public class AmpegClassicSeriesSvt410HlfProductPage extends PageObject {

	protected AmpegClassicSeriesSvt410HlfProductPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String getHandlingWeightSpecification() {
		String handlingWeight = 
				this.driver.findElement(By.xpath("//div[@class='specsCopy']/b[last()]")).getText()
				+
				this.driver.findElement(By.xpath("//div[@class='specsCopy']/b[last()]/following-sibling::text()[1]")).getText();
		
		return handlingWeight;
	}

}
