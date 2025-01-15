package com.practicetestautomation.tests.exceptions;

import com.practicetestautomation.pageobjects.ExceptionsPage;
import com.practicetestautomation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionsTest extends BaseTest {

    @Test(groups = "exceptions")
    public void testNoSuchElementException() {
        ExceptionsPage exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
        exceptionsPage.clickAddRow();
        exceptionsPage.load();
        Assert.assertTrue(exceptionsPage.row2InputFieldDisplayed(), "Row 2 Input is not Displayed");
    }

    @Test(groups = "exceptions")
    public void testTimeoutException() {
        ExceptionsPage exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
        exceptionsPage.clickAddRow();
        exceptionsPage.load();
        Assert.assertTrue(exceptionsPage.row2InputFieldDisplayed(), "Row 2 Input is not Displayed");
    }

    @Test(groups = "exceptions")
    public void testElementNotInteractableException() {
        ExceptionsPage exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
        exceptionsPage.clickAddRow();
        exceptionsPage.load();
        Assert.assertTrue(exceptionsPage.row2InputFieldDisplayed(), "Row 2 Input is not Displayed");
        exceptionsPage.enterTextInRow2();
        Assert.assertEquals(exceptionsPage.getSavedText(), "Row 2 was saved");

    }

    @Test(groups = "exceptions")
    public void testInvalidElementStateException() {
        ExceptionsPage exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
        exceptionsPage.row1ClearAndType();
        Assert.assertEquals(exceptionsPage.getSavedText(), "Row 1 was saved");
    }

    @Test(groups = "exceptions")
    public void testStaleElementReferenceException() {
        ExceptionsPage exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
        exceptionsPage.instructionsText();
        exceptionsPage.clickAddRow();
        Assert.assertFalse(exceptionsPage.instructionsInvisible(), "Instructions text is still displayed");
    }
}