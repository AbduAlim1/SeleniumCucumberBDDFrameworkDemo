package com.amazon.pages;

import com.amazon.utility.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    /**
     * used to initialize the webElements for @FindBy annotation
     */
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
