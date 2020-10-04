package utility;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before
    public void beforeTest(Scenario scenario) {
        LogRegister.printLogInfo("Starting execution scenario " + scenario.getName());
        SeleniumMethodsHelp.setEvidenceFolder(scenario.getName());
        BrowserConfiguration.setDriverConfig();
        LogRegister.printLogInfo("Opened browser");
    }

    @After
    public void afterTest() {
        BrowserConfiguration.getDriver().close();
        BrowserConfiguration.getDriver().quit();
        LogRegister.printLogInfo("Closed browser");
    }


}
