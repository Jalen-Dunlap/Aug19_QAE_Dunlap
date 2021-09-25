package basics.framework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import javax.naming.ConfigurationException;

public class ConfigReader {
	private static Properties properties;

	public static HashMap<String, String> readConfig() {
		HashMap<String, String> configProperties = new HashMap<String, String>();
		
		try {
			FileReader stream = new FileReader("src/../resources/config.properties");
			properties = new Properties();
			
			try {
				properties.load(stream);
			} catch (IOException ex) {
				System.out.println("Unable to load from config.properties.");
			}
			stream.close();

		} catch (FileNotFoundException ex) {
			System.out.println("The config.properties file was not found");
		} catch (IOException ex) {
			System.out.println("Unable to read config.properties.");
		}
		
		for() {
			
		}
		
		return configProperties;
	}
}
