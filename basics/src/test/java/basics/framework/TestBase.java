package basics.framework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {	
	protected WebDriver driver;
	protected String baseUrl;
	private String driverType;
	
	protected TestBase(String baseUrl) {
		this.baseUrl = baseUrl;
		
		this.driver = new ChromeDriver();//WebDriverFactory.getManager(driverType);
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
