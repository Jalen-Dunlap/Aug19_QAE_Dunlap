package basics.framework;

import java.util.HashMap;

public class DriverTypes {
	public static HashMap<String, String> driverList() {
		HashMap<String, String> drivers = new HashMap<String, String>();
		drivers.put( "edge", "msedgedriver.exe");
		drivers.put( "chrome" , "chromedriver.exe");
		
		return drivers;
	}	
}
