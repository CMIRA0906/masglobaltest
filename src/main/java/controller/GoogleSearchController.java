package controller;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.GoogleSearchPage;
import utility.LogRegister;

public class GoogleSearchController {

    private GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    public void openGoogleSearch() {
        try {
            googleSearchPage.openGoogleSearch();
        } catch (Exception e) {
            LogRegister.printLogError(e.getMessage());
        }


    }

    public void typeIntoSearch(String wordTosearch) {
        try {
            googleSearchPage.typeIntoSearch(wordTosearch);
        } catch (NoSuchElementException e) {
            LogRegister.printLogError(e.getMessage());
        }

    }

    public void clickToGoogleSearchBtn() {
        try {
            googleSearchPage.clickToGoogleSearchBtn();
        } catch (Exception e) {
            LogRegister.printLogError(e.getMessage());
        }


    }

    public void resultIsDisplayed() {
        try {
            Assert.assertTrue("Result is not displayed", googleSearchPage.resultIsDisplayed());
        } catch (Exception e) {
            LogRegister.printLogError(e.getMessage());
        }

    }


    public void isFirtDisplayedSearchedText(String searchedText) throws Exception {
        try {
            Assert.assertEquals("Found text is different that expected", googleSearchPage.getFirtsResultIsDisplayed(), searchedText);
        } catch (Exception e) {
            LogRegister.printLogError(e.getMessage());
            throw new Exception(e.getMessage());
        }


    }

    public void clickOnResultIsDisplayed(int resultNumber) {
        try {
            googleSearchPage.clickOnResultIsDisplayed(1);
        } catch (Exception e) {
            LogRegister.printLogError(e.getMessage());
        }
    }

    public void isRedirecToPage(String namePage) {
        try {
            Assert.assertEquals("System did not redirect to expected page ",googleSearchPage.getNamePage(), namePage);
        } catch (Exception e) {
            LogRegister.printLogError(e.getMessage());
        }
    }
    public void isSuggestionListDisplayed() {
        try {
            Thread.sleep(6000);
            Assert.assertTrue("Not displayed to the suggestion list ",googleSearchPage.isSuggestionListDisplayed());
        } catch (Exception e) {

            LogRegister.printLogError(e.getMessage());
        }
    }
    public void clicOnSuggestionInTheList(int recordNumber) {
        try {
            googleSearchPage.iClickOnTheSuggestionInTheList(recordNumber);
        } catch (Exception e) {
            LogRegister.printLogError(e.getMessage());
            LogRegister.printLogError(e.getMessage());
        }
    }


}
