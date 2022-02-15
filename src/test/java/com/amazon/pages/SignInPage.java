package com.amazon.pages;

import com.amazon.utility.Config.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.amazon.utility.Config.BrowserUtil.*;

public class SignInPage extends BasePage{

    @FindBy (xpath = "//*[@class='a-row a-spacing-base']/label")
    private WebElement signInTextBoxLabel;

    @FindBy (xpath = "//input[@id='continue']")
    private WebElement continueBtn;

    @FindBy (id = "auth-email-missing-alert")
    private WebElement continueBtnErrorMsg;

    /**
     * return the display text above sign in box
     * @return String
     */
    public String getSignInboxText(){
        return getWebElementText(signInTextBoxLabel);
    }

    /**
     * return the current pageTitle as a String
     * @return PageTitle as String
     */
    public String getSignInPageTitle(){
        return Driver.getDriver().getTitle();
    }


    /**
     * clicks on the continue button
     */
    public void clickOnContinueBtn(){
        clickOnElement(continueBtn);
    }

    /**
     * display the error message
     * @return error message as String
     */
    public String getContinueBtnErrorMsgText(){
        return getWebElementText(continueBtnErrorMsg);
    }


}
