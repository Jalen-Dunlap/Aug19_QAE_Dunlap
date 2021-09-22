package basics.framework;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {

	@Override
	public void createDriver() {
		this.driver = new EdgeDriver();
	}
}
