package basics.demoQa.foundation;

import basics.framework.TestBase;

public class DemoQaTests extends TestBase {

	protected DemoQaTests() {
		super("www.demoqa.com");
	}

	public void goTo(String url) {
		getDriver().navigate().to(this.baseUrl+url);
	}
}
