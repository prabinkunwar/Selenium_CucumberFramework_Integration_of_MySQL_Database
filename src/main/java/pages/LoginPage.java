package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login' and @type='submit']")
	WebElement SIGN_IN_BUTTON_ELEMENT;

	public void enterUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickSignInButton() {
		SIGN_IN_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getPageTitle() {
		return driver.getTitle();

	}
}
