package basics.pageObjects.ampegPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basics.pageObjects.PageObject;

public class AmpegHomePage extends PageObject {

	public AmpegHomePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public ProductsPage clickProductsLinkInMenu() {
		WebElement productsLink = this.driver.findElement(By.xpath("//div[@class='header-nav']//a[@title='Products']"));
		productsLink.click();
		
		return new ProductsPage(this.driver,this.baseUrl);
	}
}
