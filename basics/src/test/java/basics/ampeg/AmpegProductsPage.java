package basics.ampeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basics.pageObjects.PageObject;

public class AmpegProductsPage extends PageObject {

	protected AmpegProductsPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public AmpegSvtProSeriesProductPage clickSvtProSeriesBassHeadsProduct() {
		WebElement proSeries = this.driver.findElement(By.xpath("//table[@id='tableMain']//td[@id='productIndex']//img[@alt='SVT Pro Series: Bass heads']/.."));
		proSeries.click();
		
		return new AmpegSvtProSeriesProductPage(this.driver,this.baseUrl);
	}

	public AmpegClassicSeriesBassHeadsAndEnclosuresProductPage clickClassicSeriesBassHeadsAndEnclosuresProduct() {
		WebElement classicSeries = this.driver.findElement(By.xpath("//table[@id='tableMain']//td[@id='productIndex']//img[@alt='Classic Series: Bass heads & enclosures']/.."));
		classicSeries.click();
		
		return new AmpegClassicSeriesBassHeadsAndEnclosuresProductPage(this.driver,this.baseUrl);
	}
}
