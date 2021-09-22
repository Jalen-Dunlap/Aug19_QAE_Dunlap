package basics.framework;

public class WebDriverFactory {

	public static DriverManager getManager(String driverType) {
		if (driverType.equals("Edge")) {
			return new EdgeDriverManager();
		}else if (driverType.equals("Chrome")) {
			return new ChromeDriverManager();
		}
		return null;
	}
}
