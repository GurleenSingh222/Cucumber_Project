package stepdefinations;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStepDefination extends TestBase{
	
	HomePage hp;
	
@Before
public void initialization() {
	TestBase.initialize();
	hp = new HomePage();
}
@After
public void quit() {
	closeBrowser();
}
	
@Given("user is on home page")
public void user_is_on_home_page(){
	
	hp.openHomePage();
	
}
@When("title of the homepage is {string}")
public void title_of_the_homepage_is(String string) {
    String actualTitle = hp.verifyTitle();
    String expectedTitle = string;
    Assert.assertEquals(expectedTitle, actualTitle);
}
@Then("user click on Best Seller link")
public void user_click_on_best_seller_link() {
    hp.clickonBestSellerLink();
}
@Then("best seller page opens")
public void best_seller_page_opens() {
    String actualTitle = hp.verifyTitle();
    String expectedTitle = "Amazon.ca Best Sellers: The most popular items on Amazon";
    Assert.assertEquals(actualTitle, expectedTitle);
}
@Then("user click on homebutton")
public void user_click_on_homebutton() {
    hp.clickonHomeButton();
}
@Then("user comes back to homepage")
public void user_comes_back_to_homepage() {
	String actualTitle = hp.verifyTitle();
    String expectedTitle = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
    Assert.assertEquals(expectedTitle, actualTitle);
}


}
