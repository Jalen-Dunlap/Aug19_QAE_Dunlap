package basics.demoQa.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.demoQa.foundation.DemoQaTestBase;
import basics.demoQa.pageObjects.DemoQaHomePage;
import basics.demoQa.pageObjects.LinksPage;

public class LinksTests extends DemoQaTestBase{
	@Test
	/*	Manual Test
	 *	Go to /links
	 * 	Click the Home Link
	 * 	On new tab click join now
	 *  Assert that we are on the correct page
	 */
	public void canClickJoinNowLinkOnHomePageFromLinks() {
		
		goTo("links");
		String expectedUrl = "https://www.toolsqa.com/selenium-training/";

		new LinksPage(getDriver(),getDriver().getCurrentUrl())
		.clickHomeLink()
		.clickJoinNow();

		String actualUrl = getDriver().getCurrentUrl();
		assertEquals("Not the expected Url",actualUrl,expectedUrl);
	}

	@Test
	public void canClickCreatedLinkFromLinks() {

	}

}
