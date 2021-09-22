package basics.framework;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	@Override
	public void createDriver() {
		this.driver = new ChromeDriver();
	}
}
