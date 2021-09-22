package basics.framework;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManger extends DriverManger {

	@Override
	public void createDriver() {
		this.driver = new EdgeDriver();
	}
}
