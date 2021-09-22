package basics.framework;

public class WebDriverFactory {

	public static DriverManager getManager(String driverType) {
		
		System.setProperty("webdriver." + driverType + ".driver"
				, "/basics/resources/" + DriverTypes.driverList().get(driverType));
		
		if (driverType.equals("edge")) {
			return new EdgeDriverManager();
		}else if (driverType.equals("chrome")) {
			return new ChromeDriverManager();
		}else {
			return null;
		}
	}
}
