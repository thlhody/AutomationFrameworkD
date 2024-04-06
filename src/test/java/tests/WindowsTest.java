package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.HomePage;
import pages.WindowPage;
import sharedData.SharedData;

public class WindowsTest extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getWebDriver());
        WindowPage windowPage = new WindowPage(getWebDriver());

        homePage.navigateToAlertsFrameWindowsPage();
        alertFrameWindowPage.navigateToWindowPage();
        windowPage.interactWithTabBrowser();
        windowPage.interactWithWindowBrowser();
    }
}