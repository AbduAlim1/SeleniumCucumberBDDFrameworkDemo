package com.amazon.step_definitions;

import com.amazon.pages.AmazonHomePage;
import com.amazon.pages.ItemDisplayPage;
import com.amazon.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class AmazonKindleStepDefs {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    ItemDisplayPage itemDisplayPage = new ItemDisplayPage();
    SignInPage signInPage = new SignInPage();

    @Given("user located on amazon homepage")
    public void user_located_on_amazon_homepage() {
        amazonHomePage.goToHomePage();
    }

    @When("user clicks on the Hamburger menu")
    public void user_clicks_on_the_hamburger_menu() {
        amazonHomePage.clickOnHamburgerMenu();
    }

    @And("user selects {string} under Hamburger menu")
    public void user_selects_under_hamburger_menu(String item) {
        amazonHomePage.clickOnHamburgerMenuItem(item);
    }

    @And("user clicks {string} under Kindle E-Reader")
    public void user_clicks_under_kindle_e_reader(String item) {
        amazonHomePage.clickOnHamburgerSubMenuItemUnderKindle(item);
    }

    @And("user clicks on the Buy Now button")
    public void user_clicks_on_the_buy_now_button() {
        itemDisplayPage.clickOnBuyButton();
    }

    @Then("user should be re-directed to Sign-in page")
    public void user_should_be_re_directed_to_sign_in_page() {
        String expectedPageTitle = "Amazon Sign In";
        String actualPageTitle = signInPage.getSignInPageTitle();
        assertEquals(expectedPageTitle,actualPageTitle);
    }

    @Then("verify the content text below on Sign-in page")
    public void verify_the_content_text_below_on_sign_in_page(String string) {
        assertEquals(string,signInPage.getSignInboxText());
    }

    @When("the user clicks on continue button without entering in sign-in box")
    public void the_user_clicks_on_continue_button_without_entering_in_sign_in_box() {
       signInPage.clickOnContinueBtn();
    }

    @Then("verify the error message that displayed")
    public void verify_the_error_message_that_displayed(String errorMsg) {
        assertEquals(errorMsg,signInPage.getContinueBtnErrorMsgText());
    }


}
