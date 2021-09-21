package basics.ampeg;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.framework.TestBase;

public class PageObjectPatternProject extends TestBase{
	
	@Test
	public void canNavigateToHomePageFromProductDetailsPage() {
		String homeUrl = this.baseUrl + "/index.html";

		new AmpegHomePage(this.driver,this.baseUrl)
		.clickProductsLinkInMenu()
		.clickSvtProSeriesBassHeadsProduct()
		.clickSvt3ProLink()
		.clickHomeBreadcrumbLink();
		
		String currentUrl = this.driver.getCurrentUrl();
		
		assertTrue("The end page is not the home page url of: " + homeUrl, currentUrl .equals(homeUrl));
	}

	@Test
	public void canGetHandleWeightOfSvt410HlfAmp() {
		String handlingWeight = 
				new AmpegHomePage(this.driver,this.baseUrl)
				.clickProductsLinkInMenu()
				.clickClassicSeriesBassHeadsAndEnclosuresProduct()
				.clickAmpegClassicSeriesSvt410HlfProduct()
				.getHandlingWeightSpecification();
		
		assertTrue("The handling weight is not 85 pounds",handlingWeight.equals("Handling Weight: 85 Pounds"));
	}
}
