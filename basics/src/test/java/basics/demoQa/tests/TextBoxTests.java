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
	 *  Click Submit
	 *  Confirm the labels match the entered information 
	 */
	public void canFillOutPageForm() {
		goTo("text-box");
		
		String name = "Jalen Dunlap";
		String email = "jalen@dunlap.com";
		String curAddress = "123 Dreary Lane";
		String permAddress = "Muffin Lane";
		
		TextBoxPage page = 
				new TextBoxPage(getDriver(),getDriver().getCurrentUrl())
				.enterUserName(name)
				.enterEmail(email)
				.enterCurrentAddress(curAddress)
				.enterPermanentAddress(permAddress)
				.clickSubmit();
		
		String labelName = page.getLabelName();
		
		assertTrue("Names do not match.",labelName.equals("Name:" + name));
		
		String labelEmail = page.getEmail();
		
		assertTrue("Emails do not match.",labelEmail.equals("Email:"+ email));
		
		String labelCurAddress = page.getCurrentAddress();
		
		assertTrue("Current Addresses do not match.",labelCurAddress.equals("Current Address :"+ curAddress));
		
		String labelPermAddress = page.getPermanentAddress();
		
		assertTrue("Permanent Addresses do not match.",labelPermAddress.equals("Permananet Address :"+ permAddress));
	}
}
