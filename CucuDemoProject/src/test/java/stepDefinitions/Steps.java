package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class Steps {

	WebDriver driver;
	PageObjectManager pageObjectmethods;
	//ConfigFileReader testDatainputs;
	WebDriverManager DriverManager;

	@Given("^user navigated to given URL$")
	public void user_navigated_to_given_URL() throws Throwable {
		DriverManager=new WebDriverManager();
		//testDatainputs=new ConfigFileReader(); //Create object testDatainputs for ConfigFileReader class to fetch methods in it
		driver=DriverManager.getDriver();
		/*System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);*/
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		pageObjectmethods=new PageObjectManager(driver);
		pageObjectmethods.getHomePage().enterAdrenalinUsername().sendKeys(FileReaderManager.getInstance().getConfigReader().getMUsername());
		pageObjectmethods.getHomePage().enterAdrenalinPassword().sendKeys(FileReaderManager.getInstance().getConfigReader().getMPassword());
	}

	@When("^clicks on submit button$")
	public void clicks_on_submit_button() throws Throwable {

		pageObjectmethods.getHomePage().SubmitBtn().click();
		
	}
}