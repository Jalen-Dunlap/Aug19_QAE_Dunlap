package basics.framework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		driverManager.getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driverManager.getDriver().manage().window().maximize();
		driverManager.getDriver().navigate().to(this.baseUrl);
	}
	
	@After
	public void cleanup() {
		this.driverManager.quitDriver();
	}
}
