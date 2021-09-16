package basics.pageObjects.ampegPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basics.pageObjects.PageObject;

public class ProductsPage extends PageObject {

	protected ProductsPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public SvtProSeriesProductPage clickSvtProSeriesBassHeadsProduct() {
		WebElement proSeries = this.driver.findElement(By.xpath("//table[@id='tableMain']//td[@id='productIndex']//img[@alt='SVT Pro Series: Bass heads']/.."));
		proSeries.click();
		
		return new SvtProSeriesProductPage(this.driver,this.baseUrl);
	}
}
