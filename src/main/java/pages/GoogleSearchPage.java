package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserConfiguration;
import utility.SeleniumMethodsHelp;
import utility.Waits;

import java.util.List;

public class GoogleSearchPage {
    private WebDriver driver;


    @FindBy(name = "q")
    private WebElement searchTxt;

    @FindBy(name = "btnK")
    private WebElement searchBtn;

    @FindBy(id = "result-stats")
    private WebElement resultStatsLabel;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3/span")
    private WebElement firtsResultLabel;

    @FindAll(@FindBy(xpath = "//*[@class='aajZCb']/ul/li"))
    private List<WebElement> suggestionList;


    public GoogleSearchPage() {
        this.driver = BrowserConfiguration.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void openGoogleSearch() {
        driver.get("https://www.google.com/");

    }

    public void typeIntoSearch(String wordTosearch) {
        SeleniumMethodsHelp.highlightElement(searchTxt);
        searchTxt.sendKeys(wordTosearch);
    }

    public void clickToGoogleSearchBtn() {
        Waits waits = new Waits(driver);
        waits.waitElement(searchBtn);
        SeleniumMethodsHelp.highlightElement(searchBtn);
        searchBtn.click();
    }

    public boolean resultIsDisplayed() {
        SeleniumMethodsHelp.highlightElement(resultStatsLabel);
        return resultStatsLabel.isDisplayed();
    }

    public String getFirtsResultIsDisplayed() {
        return firtsResultLabel.getText();
    }

    public void clickOnResultIsDisplayed(int resultNumber) {
        WebElement webElementResult = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[" + resultNumber + "]/div/div[1]/a/h3/span"));
        SeleniumMethodsHelp.highlightElement(webElementResult);
        webElementResult.click();
    }

    public String getNamePage() {
        return driver.getTitle();
    }


    public boolean isSuggestionListDisplayed() {
        return suggestionList.size() > 0;

    }

    public void iClickOnTheSuggestionInTheList(int recordNumber) {
        SeleniumMethodsHelp.highlightElement(suggestionList.get(recordNumber));
        suggestionList.get(recordNumber).click();
    }


}
