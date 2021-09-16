package basics.pageObjects.ampegPageObjects;

import org.openqa.selenium.WebDriver;

import basics.pageObjects.PageObject;

public class Svt3ProProductPage extends PageObject {

	protected Svt3ProProductPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public AmpegHomePage clickHomeBreadcrumbLink() {
		return new AmpegHomePage(this.driver,this.baseUrl);
	}
}
