package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserConfiguration;
import utility.Waits;

public class GoogleSearchPage {

    private BrowserConfiguration browserConfiguration = new BrowserConfiguration();
    private WebDriver driver;


    @FindBy(name = "q")
    private WebElement searchTxt;

    @FindBy(name = "btnK")
    private WebElement searchBtn;

    @FindBy(id = "result-stats")
    private WebElement resultStatsLabel;

    public GoogleSearchPage() {
        this.driver = browserConfiguration.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void openGoogleSearch() {
        driver.get("https://www.google.com/");

    }

    public void typeIntoSearch(String wordTosearch) {
        searchTxt.sendKeys(wordTosearch);
    }

    public void clickToGoogleSearchBtn() {
        Waits waits = new Waits(driver);
        waits.waitElement(searchBtn);
        searchBtn.click();
    }

    public boolean resultIsDisplayed() {
        return resultStatsLabel.isDisplayed();
    }


    public static void main(String[] args) {
        GoogleSearchPage g = new GoogleSearchPage();
        g.openGoogleSearch();
        g.typeIntoSearch("The name of the wind");


    }


}
