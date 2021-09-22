package basics.framework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Settings {
	String browserType;

	public static Settings get() {
		Settings settings = new Settings();
		try {
			FileReader stream = new FileReader("/basics/resources/config.properties");
			BufferedReader reader = new BufferedReader(stream);
			
			settings.browserType = reader.readLine().split(":")[1];
			
			reader.close();
		} catch(FileNotFoundException ex) {

		} catch(IOException ex1) {

		}
		
		return settings;
	}
}
