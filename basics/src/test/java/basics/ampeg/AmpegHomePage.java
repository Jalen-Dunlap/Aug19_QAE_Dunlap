package basics.ampeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basics.framework.PageObject;

public class AmpegHomePage extends PageObject {

	public AmpegHomePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public AmpegProductsPage clickProductsLinkInMenu() {
		WebElement productsLink = this.driver.findElement(By.xpath("//div[@class='header-nav']//a[@title='Products']"));
		productsLink.click();
		
		return new AmpegProductsPage(this.driver,this.baseUrl);
	}
}
