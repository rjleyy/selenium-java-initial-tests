package com.practicetestautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExceptionsPage extends BasePage {

    private By addRowLocator = By.xpath("//button[@id='add_btn']");
    private By row2Locator = By.xpath("//div[@id='row2']//input[@type='text']");
    private By row1SaveButtonLocator = By.xpath("//button[@id='save_btn']");
    private By hiddenSaveLocator = By.xpath("//div[@id='row2']//button[@id='save_btn']");
    private By savedTextLocator = By.id("confirmation");
    private By editButtonLocator = By.xpath("//button[@id='edit_btn']");
    private By row1Locator = By.xpath("//input[@value='Pizza']");
    private By instructionsTextLocator = By.xpath("//p[@id='instructions']");


    public ExceptionsPage(WebDriver driver) {
        super(driver);
    }
    public void visit() {
        super.visit("https://practicetestautomation.com/practice-test-exceptions/");
    }
    // Create a wait for element function with the row2Locator
    public void load() {
        waitForElement(row2Locator);
    }
    public void clickAddRow() {
        driver.findElement(addRowLocator).click();
    }
    public void row2InputField() {
        driver.findElement(row2Locator);
    }
    public boolean row2InputFieldDisplayed() {
        return isDisplayed(row2Locator);
    }
    // Create a method that types into row 2 and saves
    public void enterTextInRow2() {
        driver.findElement(row2Locator).sendKeys("text");
        driver.findElement(hiddenSaveLocator).click();
    }
    public String getSavedText() {
        return waitForElement(savedTextLocator).getText();
    }
    // Create a method that clicks the edit text button, clears the text, and types new text
    public void row1ClearAndType() {
        WebElement editButton = driver.findElement(editButtonLocator);
        editButton.click();
        WebElement row1InputField = driver.findElement(row1Locator);
        row1InputField.sendKeys("text");
        WebElement hiddenSaveButton = driver.findElement(row1SaveButtonLocator);
        hiddenSaveButton.click();
    }
    public void instructionsText() {
        driver.findElement(instructionsTextLocator);
    }
    public boolean instructionsInvisible() {
        return isDisplayed(instructionsTextLocator);
    }
}
