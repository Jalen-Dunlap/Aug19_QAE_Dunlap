package basics.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {

	@Override
	public WebDriver newDriver() {
		return new EdgeDriver();
	}
}
