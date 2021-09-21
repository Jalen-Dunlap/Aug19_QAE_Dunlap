package basics.ampeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basics.framework.PageObject;


public class AmpegSvtProSeriesProductPage extends PageObject {

	protected AmpegSvtProSeriesProductPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public AmpegSvt3ProProductPage clickSvt3ProLink() {
		WebElement product = this.driver.findElement(By.xpath("//div[@id='seriesHome']//img[@alt='SVT-3PRO']/.."));
		product.click();
		
		return new AmpegSvt3ProProductPage(this.driver,this.baseUrl);
	}
}
