package com.practicetestautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulLoginPage extends BasePage {
    private By logoutButtonLocator = (By.linkText("Log out"));

    public SuccessfulLoginPage(WebDriver driver) {
        super(driver);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public String getCurrentPageSource() {
        return driver.getPageSource();
    }
    public boolean isLogoutButtonDisplayed() {
        return isDisplayed(logoutButtonLocator);
    }
    public void load() {
        waitForElement(logoutButtonLocator);
    }
}
