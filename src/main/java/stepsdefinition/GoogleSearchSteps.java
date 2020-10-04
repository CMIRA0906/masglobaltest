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

    @Then("^System redirect to to  search results page$")
    public void systemRedirectToToSearchResultsPage() {
        googleSearchController.resultIsDisplayed();
    }


}
