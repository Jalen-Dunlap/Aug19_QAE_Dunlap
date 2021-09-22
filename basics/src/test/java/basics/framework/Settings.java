package basics.framework;

public class Settings {
	String browserType;

	public static Settings get() {
		Settings settings = new Settings();
		settings.browserType = ConfigReader.getBrowserType();
		return settings;
	}
}
