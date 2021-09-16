package basics.pageObjects.ampegPageObjects;

import org.openqa.selenium.WebDriver;

import basics.pageObjects.PageObject;

public class ProductsPage extends PageObject {

	protected ProductsPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public SvtProSeriesProductPage clickSvtProSeriesBassHeadsProduct() {
		
		return new SvtProSeriesProductPage(this.driver,this.baseUrl);
	}
}
