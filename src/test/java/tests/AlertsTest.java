package tests;

import object.data.AlertObject;
import org.testng.annotations.Test;
import pages.AlertFrameWindowPage;
import pages.AlertsPage;
import pages.HomePage;
import property.utility.PropertyUtility;
import shared.data.SharedData;

public class AlertsTest extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getWebDriver());
        AlertsPage alertsPage = new AlertsPage(getWebDriver());
        PropertyUtility propertyUtility = new PropertyUtility("AlertData");
        AlertObject alertObject = new AlertObject(propertyUtility.getAllData());

        homePage.navigateToAlertsFrameWindowsPage();
        alertFrameWindowPage.navigateToAlertsPage();

        alertsPage.alertAccept();
        alertsPage.timerAlert();

        alertsPage.alertDismissAndValidate();

        alertsPage.alertFillAndValidate(alertObject.getInputTextA());

        alertsPage.alertAcceptAndValidate();

        alertsPage.alertFillAndValidate(alertObject.getInputTextB());

    }
}
