package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.AdrenalinHomePage;

public class PageObjectManager {

	private WebDriver driver;
	private AdrenalinHomePage adrenalinLoginPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
	}

	public AdrenalinHomePage getHomePage() {
		
		adrenalinLoginPage = new AdrenalinHomePage(driver);
		return adrenalinLoginPage;
	}
}