package basics.framework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class TestBase {	
	protected DriverManager driverManager;
	protected String baseUrl;
	private Settings settings;
	
	protected TestBase(String baseUrl) {
		this.baseUrl = baseUrl;
		this.settings = Settings.get();
	}
	
	@Before
	public void setup() {
		this.driverManager = WebDriverFactory.getManager(settings.browserType);
		this.driverManager.createDriver();
		
		getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();
		getDriver().navigate().to(this.baseUrl);
	}
	
	@After
	public void cleanup() {
		this.driverManager.quitDriver();
	}
	
	public WebDriver getDriver() {
		return this.driverManager.getDriver();
	}
}
