package basics.pageObjects.ampegPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basics.pageObjects.PageObject;

public class Svt3ProProductPage extends PageObject {

	protected Svt3ProProductPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public AmpegHomePage clickHomeBreadcrumbLink() {
		WebElement home = this.driver.findElement(By.xpath("//div[@id='navLinks']//a[text()='Home']"));
		home.click();
		
		return new AmpegHomePage(this.driver,this.baseUrl);
	}
}
