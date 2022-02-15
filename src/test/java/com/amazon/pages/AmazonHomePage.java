package com.amazon.pages;

import static com.amazon.utility.BrowserUtil.*;
import com.amazon.utility.ConfigReader;
import com.amazon.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends BasePage{


    @FindBy (id = "nav-hamburger-menu")
    private WebElement hamburgerMenu;

    private String hamburgerMenuItemsXpath = "//div[.='%s']";
    private String subMenuUnderKindleXpath = "//ul[@data-menu-id=\"4\"]//a[@class= 'hmenu-item' and .='%s']";


    /**
     * Direct the driver to url from config.properties
     */
    public void goToHomePage(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    /**
     * click on the Hamburger menu icon on top left corner of the webpage
     */
    public void clickOnHamburgerMenu(){
        clickOnElement(hamburgerMenu);
    }

    /**
     * click on any of the Hamburger menu
     * @param item Kindle, Audible Audiobooks, Amazon Music, Books...
     */
    public void clickOnHamburgerMenuItem(String item){
        clickOnElement(Driver.getDriver().findElement(By.xpath(String.format(hamburgerMenuItemsXpath,item))));
    }

    /**
     * click on any of the sub menu of Hamburger menu under Kindle
     * @param item Kindle, Kindle Paperwhite, Kindle Oasis ...
     */
    public void clickOnHamburgerSubMenuItemUnderKindle(String item){
        clickOnElement(Driver.getDriver().findElement(By.xpath(String.format(subMenuUnderKindleXpath,item))));
    }





}
