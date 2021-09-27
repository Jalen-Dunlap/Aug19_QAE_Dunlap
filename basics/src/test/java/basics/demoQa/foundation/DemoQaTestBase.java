package basics.demoQa.foundation;

import basics.framework.TestBase;

public class DemoQaTestBase extends TestBase {

	protected DemoQaTestBase() {
		super("https://www.demoqa.com/");
	}

	public void goTo(String url) {
		getDriver().navigate().to(this.baseUrl+url);
	}
}
