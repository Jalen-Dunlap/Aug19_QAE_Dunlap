package basics.framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {	
	protected WebDriver driver;
	protected String baseUrl;
	
	protected TestBase(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	@Before
	public void setup() {
		this.driver.manage().window().maximize();
		this.driver.navigate().to(this.baseUrl);
	}
	
	@After
	public void cleanup() {
		this.driver.quit();
	}
}
