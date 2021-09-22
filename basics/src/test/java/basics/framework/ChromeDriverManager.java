package basics.framework;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManger extends DriverManger {

	@Override
	public void createDriver() {
		this.driver = new ChromeDriver();
	}
}
