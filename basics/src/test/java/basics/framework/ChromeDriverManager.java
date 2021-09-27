package basics.framework;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {
	private final String WEB_DRIVER_PATH = "/src/../resources/chromedriver.exe";
	private final String WEB_DRIVER_SYSTEM_PROPERTY = "webdriver.chrome.driver";
	
	@Override
	public void createDriver() {
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY, WEB_DRIVER_PATH);
		setDriver(new ChromeDriver());
	}
}
