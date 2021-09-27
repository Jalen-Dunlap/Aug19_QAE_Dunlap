package basics.demoQa.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.demoQa.foundation.DemoQaTestBase;

public class TextBoxTests extends DemoQaTestBase{

	@Test
	/*	Manual Test
	 *  Go to /text-box
	 *  Enter Full Name
	 *  Enter Email
	 *  Enter Current Address
	 *  Enter Permanent Address
	 *  Confirm the labels match the entered information 
	 */
	public void canFillOutPageForm() {
		goTo("/text-box");
		TextBoxPage page = new TextBoxPage(getDriver(),getDriver().getCurrentUrl());
	}
}
