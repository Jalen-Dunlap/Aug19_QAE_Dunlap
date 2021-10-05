package basics.framework;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {
	private final String DRIVER_EXE = "chromedriver.exe";
	private final String WEB_DRIVER_SYSTEM_PROPERTY = "webdriver.chrome.driver";
	
	@Override
	public void createDriver() {
		URL url = ClassLoader.getSystemResource(DRIVER_EXE);
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY, url.getFile());
		setDriver(new ChromeDriver());
	}
}
