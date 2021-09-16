package basics.pageObjects.ampegPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basics.pageObjects.PageObject;

public class SvtProSeriesProductPage extends PageObject {

	protected SvtProSeriesProductPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public Svt3ProProductPage clickSvt3ProLink() {
		WebElement product = this.driver.findElement(By.xpath("//div[@id='seriesHome']//img[@alt='SVT-3PRO']/.."));
		product.click();
		
		return new Svt3ProProductPage(this.driver,this.baseUrl);
	}
}
