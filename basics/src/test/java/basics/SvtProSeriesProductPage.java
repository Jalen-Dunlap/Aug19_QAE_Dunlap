package basics;

import org.openqa.selenium.WebDriver;

import basics.pageObjects.PageObject;

public class SvtProSeriesProductPage extends PageObject {

	protected SvtProSeriesProductPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public Svt3ProProductPage clickSvt3ProLink() {
		return new Svt3ProProductPage(this.driver,this.baseUrl);
	}

}
