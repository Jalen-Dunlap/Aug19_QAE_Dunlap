package basics.framework;

public class WebDriverFactory {

	public static DriverManager getManager(String driverType) {
		
		System.setProperty("webdriver." + driverType + ".driver"
				, "src/../resources/" + DriverTypes.driverList().get(driverType));//Move to drive manger spec
		
		if (driverType.equals("edge")) {
			return new EdgeDriverManager();
		} 
		
		if (driverType.equals("chrome")) {
			return new ChromeDriverManager();
		}
		
		throw new IllegalArgumentException(driverType+" is not a supported Browser type.");
	}
}
