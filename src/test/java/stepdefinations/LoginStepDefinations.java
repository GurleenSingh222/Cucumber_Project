package stepdefinations;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDefinations extends TestBase {

	LoginPage lp;
	@Before
	public void initialization() {
		TestBase.initialize();
		lp = new LoginPage();
	}
	@After
	public void quit() {
		closeBrowser();
	}

	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
        
		lp.openLoginPage();
	}

	@When("title of the page is {string}")
	public void title_of_the_page_is(String title) {

		String expectedTitle = title;
		String actualTitle = lp.readTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}

	@Then("user enters wrong username {string}")
	public void user_enters_wrong_username(String username) {

		lp.username.sendKeys(username);
	}

	@Then("user click on continue button")
	public void user_click_on_continue_button() {

		lp.continueButton.click();
	}

	@Then("user gets an error for username {string}")
	public void user_gets_an_error_for_username(String error) {

		String expectedError = error;
		String actualError = lp.readErr();
		Assert.assertEquals(expectedError, actualError);
	}

	@Then("user quit")
	public void user_quit() {

		closeBrowser();
	}

}


