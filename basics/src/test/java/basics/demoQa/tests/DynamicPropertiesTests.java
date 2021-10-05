package basics.demoQa.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.demoQa.foundation.DemoQaTestBase;
import basics.demoQa.pageObjects.DemoQaHomePage;

public class DynamicPropertiesTests extends DemoQaTestBase{

	@Test
	/*	Manual Test 
	 * 	Go to /dynamic-properties
	 * 	Wait 5 seconds 
	 * 	Make sure the 'Visible After 5 Seconds' button appears
	 */
	public void canWaitForButtonToAppear() {
		boolean isVisibleButtonAppears;
		
		isVisibleButtonAppears = 
				new DemoQaHomePage(getDriver(),getDriver().getCurrentUrl())
				.goTo("dynamic-properties")
				.canSeeVisibleAfter5SecondsButton();
		
		assertTrue("The button did not appear on the page", isVisibleButtonAppears);
	}
}
