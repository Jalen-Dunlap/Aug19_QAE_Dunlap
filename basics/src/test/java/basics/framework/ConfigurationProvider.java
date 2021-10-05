package basics.framework;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class ConfigurationProvider {
	public HashMap<String, String> getPropertiesFromResourceFile(String fileName) throws Exception {

		InputStream inputStream = null;
		Properties properties = new Properties();

		try {
			inputStream = getClass().getClassLoader().getResourceAsStream(fileName);

			if(inputStream == null) {
				throw new RuntimeException(fileName + " was not found in the Resources folder.");
			}

			properties.load(inputStream);
		}
		catch(Exception ex) {
			throw new RuntimeException();
		}
		finally {
			if(inputStream != null) {
				inputStream.close();
			}
		}

		HashMap<String, String> propertyValuesByKey = new HashMap<String, String>();

		for (String key : properties.stringPropertyNames()) {
			String value = properties.getProperty(key);
			propertyValuesByKey.put(key, value);
		}

		return propertyValuesByKey;
	}
}