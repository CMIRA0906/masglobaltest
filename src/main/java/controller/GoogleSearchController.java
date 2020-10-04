package controller;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.GoogleSearchPage;

public class GoogleSearchController {

    private GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    public void openGoogleSearch() {
        try {
            googleSearchPage.openGoogleSearch();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }


    }

    public void typeIntoSearch(String wordTosearch) {
        try {
            googleSearchPage.typeIntoSearch(wordTosearch);
        } catch (NoSuchElementException exception) {
            System.err.println(exception.getMessage());
        }

    }

    public void clickToGoogleSearchBtn() {
        try {
            googleSearchPage.clickToGoogleSearchBtn();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }


    }

    public void resultIsDisplayed() {
        try {
            Assert.assertTrue("Result is not displayed", googleSearchPage.resultIsDisplayed());
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }

    }


    public void isFirtDisplayedSearchedText(String searchedText) {
        try {
            Assert.assertEquals("Found text is different that expected", googleSearchPage.getFirtsResultIsDisplayed(), searchedText);
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }


    }

    public void clickOnResultIsDisplayed(int resultNumber) {
        try {
            googleSearchPage.clickOnResultIsDisplayed(1);
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }

    public void isRedirecToPage(String namePage) {
        try {
            Assert.assertEquals("System did not redirect to expected page ",googleSearchPage.getNamePage(), namePage);
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
    public void isSuggestionListDisplayed() {
        try {
            Thread.sleep(6000);
            Assert.assertTrue("Not displayed to the suggestion list ",googleSearchPage.isSuggestionListDisplayed());
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
    public void clicOnSuggestionInTheList(int recordNumber) {
        try {
            googleSearchPage.iClickOnTheSuggestionInTheList(recordNumber);
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }


}
