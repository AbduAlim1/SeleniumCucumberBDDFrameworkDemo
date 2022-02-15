package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.amazon.utility.Config.BrowserUtil.*;

public class ItemDisplayPage extends BasePage {

    @FindBy (id = "buy-now-button")
    private WebElement buyNowBtn;

    /**
     * clicks on the buy Now button
     */
    public void clickOnBuyButton(){
        clickOnElement(buyNowBtn);
    }

}
