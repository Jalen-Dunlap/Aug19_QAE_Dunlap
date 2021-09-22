package basics.framework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.naming.ConfigurationException;

public class ConfigReader {

	public static String getBrowserType() {
		try {
			FileReader stream = new FileReader("/basics/resources/config.properties");
			BufferedReader reader = new BufferedReader(stream);
			String browserType = reader.readLine().split(":")[1];
			reader.close();

			if (!DriverTypes.driverList().containsKey(browserType)) {
				throw new ConfigurationException();
			} else {
				return browserType;
			}

		} catch (FileNotFoundException ex) {
			System.out.println("Defaulting browser type to chrome.FNFE");
			return "chrome";
		} catch (IOException ex) {
			System.out.println("Unable to read config.properties, defaulting to chrome");
			return "chrome";
		} catch (ConfigurationException e) {
			System.out.println("Could not identify BrowserType in config.properties, defaulting to chrome.");
			return "chrome";
		}
	}

}
