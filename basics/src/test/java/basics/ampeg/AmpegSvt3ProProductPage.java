package basics.ampeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basics.framework.PageObject;

public class AmpegSvt3ProProductPage extends PageObject {

	protected AmpegSvt3ProProductPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public AmpegHomePage clickHomeBreadcrumbLink() {
		WebElement home = this.driver.findElement(By.xpath("//div[@id='navLinks']//a[text()='Home']"));
		home.click();
		
		return new AmpegHomePage(this.driver,this.baseUrl);
	}
}
