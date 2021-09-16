package basics.pageObjects.ampegPageObjects;

import org.openqa.selenium.WebDriver;

import basics.pageObjects.PageObject;

public class AmpegClassicSeriesBassHeadsAndEnclosuresProductPage extends PageObject {

	protected AmpegClassicSeriesBassHeadsAndEnclosuresProductPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public AmpegClassicSeriesSvt410HlfProductPage clickAmpegClassicSeriesSvt410HlfProduct() {
		
		return new AmpegClassicSeriesSvt410HlfProductPage(this.driver,this.baseUrl);
	}

}
