package basics.framework;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	protected WebDriver driver;
	
	public void createDriver() {
		
	}

	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void quitDriver() {
		this.driver.quit();
	}
}
