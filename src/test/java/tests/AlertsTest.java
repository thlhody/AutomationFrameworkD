package tests;

import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.AlertsPage;
import pages.HomePage;
import shared.data.SharedData;

public class AlertsTest extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getWebDriver());
        AlertsPage alertsPage = new AlertsPage(getWebDriver());

        homePage.navigateToAlertsFrameWindowsPage();
        alertFrameWindowPage.navigateToAlertsPage();

        alertsPage.alertAccept();
        alertsPage.timerAlert();

        alertsPage.alertDismissAndValidate();
        String text = "sarmale";
        alertsPage.alertFillAndValidate(text);

        alertsPage.alertAcceptAndValidate();
        String text2 = "Tratative";
        alertsPage.alertFillAndValidate(text2);

    }
}
