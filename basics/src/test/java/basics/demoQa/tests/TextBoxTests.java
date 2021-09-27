package basics.demoQa.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import basics.demoQa.foundation.DemoQaTests;

public class TextBoxTests extends DemoQaTests{

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
	}

	@Before
	public void setup() {
		goTo("/text-box");
	}
}
