package basics.demoQa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basics.framework.PageObject;

public class DynamicPropertiesPage extends PageObject {

	protected DynamicPropertiesPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public boolean canSeeVisibleAfter5SecondsButton() {
		boolean isVisible = false;
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement visibleAfterButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#visibleAfter")));
		isVisible = visibleAfterButton.isDisplayed();
		
		return isVisible;
	}
}
