package basics.framework;

import java.util.HashMap;

public class Settings {
	String browserType;

	public static Settings get() {
		Settings settings = new Settings();
		HashMap<String,String> configFileProperties = null;
		
		configFileProperties = ConfigReader.readConfig();
		
		settings.browserType = configFileProperties.get("BrowserType");
		
		return settings;
	}
}
