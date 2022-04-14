package steps;

import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	DatabasePage databasePage;
	LoginPage loginPage;

	@Before
	public void beforeMethod() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}

	@Given("^User is on Techfios login page$")
	public void user_is_on_Techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=login/");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginPage.enterUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button() {
		loginPage.clickSignInButton();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
		takeScreenshot(driver);
	}

	@When("^User enters \"([^\"]*)\" from the database$")
	public void user_enters_from_the_database(String loginData) {

		switch (loginData) {
		case "username":
			loginPage.enterUserName(databasePage.getData("username"));
			System.out.println("Username from Database: " + databasePage.getData("username"));
			break;

		case "password":
			loginPage.enterPassword(databasePage.getData("password"));
			System.out.println("Password from Database: " + databasePage.getData("password"));
			break;

		default:
			System.out.println("unable to extract login data from " + loginData + "from DB");
		}

	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
