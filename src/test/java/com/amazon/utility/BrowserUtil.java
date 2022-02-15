package com.amazon.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {

    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    /**
     * waits for elements to be clickable then clicks it
     * @param element
     */
    public static void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    /**
     * waits for an element to be visible then get the text
     * @param element
     * @return WebElement text as String
     */
    public static String getWebElementText(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

    /**
     * waits for the webElement to load
     * @param element
     */
    public static void waitForWebElementToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
