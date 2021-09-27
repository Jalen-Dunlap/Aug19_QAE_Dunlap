package basics.basics.tests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.junit.Test;

import com.opencsv.CSVReader;

import basics.framework.ConfigurationProvider;

public class JavaIOTest {

	@Test
	public void canGetBrowserTypeFromConfig() {
		String browserExpected = "chrome";
		String browserRetrieved = null;
		String file = "config.properties";
		HashMap<String, String> configProperties = null;

		try {
			configProperties = new ConfigurationProvider().getPropertiesFromResourceFile(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		browserRetrieved = configProperties.get("BrowserType");

		assertEquals("The browser found was not " + browserExpected,browserRetrieved ,browserExpected);
	}

	@Test
	public void canReadCsvFileIntoHashMap() {
		HashMap<String, String> bassMakesAndModels = new HashMap<String, String>();
		CSVReader csvReader;
		try {
			csvReader = new CSVReader(new FileReader("src/test/resources/basses.csv"));
			
			for(String[] nextLine : csvReader){
				bassMakesAndModels.put(nextLine[0],nextLine[1]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String BB500 = bassMakesAndModels.get("Yamaha");
		assertEquals("The last values in the csv were not imported",BB500,"BB500");
	}
}
