package basics.ampeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basics.pageObjects.PageObject;

public class AmpegClassicSeriesBassHeadsAndEnclosuresProductPage extends PageObject {

	protected AmpegClassicSeriesBassHeadsAndEnclosuresProductPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public AmpegClassicSeriesSvt410HlfProductPage clickAmpegClassicSeriesSvt410HlfProduct() {
		WebElement product = this.driver.findElement(By.xpath("//div[@id='seriesHome']//a[@href='svt410hlf/']"));
		product.click();
		
		return new AmpegClassicSeriesSvt410HlfProductPage(this.driver,this.baseUrl);
	}
}
