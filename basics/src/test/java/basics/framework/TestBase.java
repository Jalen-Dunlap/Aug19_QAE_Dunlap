package basics.framework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {	
	protected DriverManager driverManager;
	protected String baseUrl;
	protected String driverType;
	protected WebDriver driver;
	
	protected TestBase(String baseUrl) {
		this.baseUrl = baseUrl;
		this.driverManager = WebDriverFactory.getManager(driverType);
		driverManager.createDriver();
		this.driver = driverManager.getDriver();
	}
	
	@Before
	public void setup() {
		this.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		this.driver.manage().window().maximize();
		this.driver.navigate().to(this.baseUrl);
	}
	
	@After
	public void cleanup() {
		this.driver.quit();
	}
}
