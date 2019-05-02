package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdrenalinHomePage {
	
	public AdrenalinHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtID")
	private WebElement username;

	@FindBy(id = "txtPwd")
	private WebElement password;

	@FindBy(id = "lblLogin")
	private WebElement SubmitBtn;

	public WebElement enterAdrenalinUsername() {
		return username;
	}

	public WebElement enterAdrenalinPassword() {
		return password;
	}

	public WebElement SubmitBtn() {
		return SubmitBtn;
	}
}