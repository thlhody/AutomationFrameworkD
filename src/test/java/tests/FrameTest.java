package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.FramePage;
import pages.HomePage;
import sharedData.SharedData;

public class FrameTest extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getWebDriver());
        FramePage framePage = new FramePage(getWebDriver());

        homePage.navigateToAlertsFrameWindowsPage();
        alertFrameWindowPage.navigateToFramePage();

        framePage.switchToIFrame("frame1");
        framePage.switchToParentFrame();
        framePage.switchToIFrame("frame2");
    }
}
