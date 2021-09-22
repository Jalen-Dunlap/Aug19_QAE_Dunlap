package basics.framework;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	protected WebDriver driver;
	
	public void createDriver() {
		this.driver = newDriver();
	}

	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void quitDriver() {
		this.driver.quit();
	}
	
	protected abstract WebDriver newDriver();
}
