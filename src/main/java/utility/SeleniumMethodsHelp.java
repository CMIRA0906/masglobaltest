package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SeleniumMethodsHelp {

    private static String evidencePath = "";

    public static void setEvidenceFolder(String folderStringPath) {

        LocalDateTime ldt = LocalDateTime.now().plusDays(1);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH-mm", Locale.ENGLISH);
        String currentDayAsString = dateFormat.format(ldt);
        try {
            File folderPath = new File("evidences/".concat(folderStringPath).concat(currentDayAsString));
            if (!folderPath.exists()) {
                if (folderPath.mkdirs()) {
                    LogRegister.printLogInfo("Created folder");
                } else {
                    LogRegister.printLogInfo("Error creating folder");
                }
            }
            evidencePath = folderPath.toString();
        } catch (Exception e) {
            LogRegister.printLogError("Exception creating folder".concat(e.getMessage()));
        }

    }

    public static void highlightElement(WebElement element) {

        JavascriptExecutor js = ((JavascriptExecutor) BrowserConfiguration.getDriver());
        js.executeScript("arguments[0].style.border='3px solid red'", element);
        takesScreenshot();
    }

    private static void takesScreenshot() {
        TakesScreenshot scrShot = ((TakesScreenshot) BrowserConfiguration.getDriver());
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(evidencePath.concat("\\evidence" + System.currentTimeMillis() + ".jpg"));
        try {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e) {
            LogRegister.printLogError("The image was not saved");
        }

    }


}
