package basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class PageObjectPatternProject extends TestBase{

	@Test
	public void sanityTest() {
		String currentUrl = this.driver.getCurrentUrl();
		String expectedUrl = "https://ampeg.com/index.html";
		
		assertTrue("Did not reach correct website",currentUrl.equals(expectedUrl));
	}
	
	@Test
	public void canNavigateToHomePageFromProductDetailsPage() {
		String homeUrl = this.baseUrl + "/index.html";
		
		AmpegHomePage page = new AmpegHomePage(this.driver,this.baseUrl)
				.clickProductsLinkInMenu()
				.clickSvtProSeriesBassHeadsProduct()
				.clickSvt3ProLink()
				.clickHomeBreadcrumbLink();
		
		String currentUrl = this.driver.getCurrentUrl();
		
		assertTrue("The end page is not the home page url of: " + homeUrl, currentUrl .equals(homeUrl));
		
	}

}
