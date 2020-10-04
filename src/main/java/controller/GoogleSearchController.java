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
           Assert.assertTrue("Result is not desplayed",googleSearchPage.resultIsDisplayed());
        } catch (NoSuchElementException exception) {
            System.err.println(exception.getMessage());
        }

    }


}
