package basics.pageObjects.ampegPageObjects;

import org.openqa.selenium.WebDriver;

import basics.pageObjects.PageObject;

public class AmpegHomePage extends PageObject {

	public AmpegHomePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public ProductsPage clickProductsLinkInMenu() {
		return new ProductsPage(this.driver,this.baseUrl);
	}
}
