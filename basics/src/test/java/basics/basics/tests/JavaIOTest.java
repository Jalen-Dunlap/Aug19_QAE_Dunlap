package basics.basics.tests;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

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
		/*
		 * //arrange
		 * create hashMap
		 * 
		 * //act
		 * read csv file basses.csv
		 * insert data into hashmap ignoring string count
		 * 
		 * //assert
		 * assert that 
		 */
	}

}
