package basics.demoQa.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.demoQa.foundation.DemoQaTestBase;
import basics.demoQa.pageObjects.RadioButtonPage;

public class RadioButtonTests extends DemoQaTestBase{

	@Test
	/*	Manual Test
	 *  Go to /radio-button
	 *  Click Yes
	 *  Confirm the test below says "You have selected Yes"
	 */
	public void canClickRadioButtonYes() {
		goTo("radio-button");
		String expectedText = "You have selected Yes";
		
		RadioButtonPage radioPage = 
				new RadioButtonPage(getDriver(),getDriver().getCurrentUrl())
				.clickYesRadioButton();
		
		String actualPopupText = radioPage.getPopupText();
		
		assertEquals("Text does not match for yes button", actualPopupText, expectedText);
	}
	
	@Test
	/*	Manual Test
	 *  Go to /radio-button
	 *  Click Impressive
	 *  Confirm the test below says "You have selected Impressive"
	 */
	public void canClickRadioButtonImpressive() {
		goTo("radio-button");
		String expectedText = "You have selected Impressive";
		
		RadioButtonPage radioPage = 
				new RadioButtonPage(getDriver(),getDriver().getCurrentUrl())
				.clickImpressiveRadioButton();
		
		String actualPopupText = radioPage.getPopupText();
		
		assertEquals("Text does not match for yes button", actualPopupText, expectedText);
	}

}
