package basics.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	@Override
	public WebDriver newDriver() {
		return new ChromeDriver();
	}
}
