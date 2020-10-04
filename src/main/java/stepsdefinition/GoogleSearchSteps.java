package stepsdefinition;

import controller.GoogleSearchController;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {

    private GoogleSearchController googleSearchController = new GoogleSearchController();

    @Given("^user is on the Google homepage$")
    public void userIsOnTheGoogleHomepage() {
        googleSearchController.openGoogleSearch();
    }

    @When("User type \"([^\"]*)\" into the search field$")
    public void userTypeIntoTheSearchField(String word) {
        googleSearchController.typeIntoSearch(word);
    }

    @And("^User click the Google Search button$")
    public void userClickTheGoogleSearchButton() {
        googleSearchController.clickToGoogleSearchBtn();
    }

    @Then("^System redirect to search results page$")
    public void systemRedirectToToSearchResultsPage() {
        googleSearchController.resultIsDisplayed();
    }


    @And("^the first result is \"([^\"]*)\"$")
    public void theFirstResultIsTheNameOfTheWindPatrickRothfuss(String expectedResult) {
        googleSearchController.isFirtDisplayedSearchedText(expectedResult);

    }

    @When("^I click on the first result link$")
    public void iClickOnTheFirstResultLink() {
        googleSearchController.clickOnResultIsDisplayed(1);
    }

    @Then("^System redirect to the \"([^\"]*)\" page$")
    public void systemRedirectToThePage(String namePage) {
        googleSearchController.isRedirecToPage(namePage);

    }

    @Then("^The system stay in Google home page$")
    public void theSystemStayInHomePage() {
        googleSearchController.isRedirecToPage("Google");
    }

    @And("^the suggestions list is displayed$")
    public void theSuggestionsListIsDisplayed() {
        googleSearchController.isSuggestionListDisplayed();

    }

    @And("^I click on the first suggestion in the list$")
    public void iClickOnTheFirstSuggestionInTheList() {

        googleSearchController.clicOnSuggestionInTheList(0);
    }
}
