package tests;

import object.data.WebTableObject;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablesPage;
import property.utility.PropertyUtility;
import shared.data.SharedData;

public class WebTableTest extends SharedData {

    @Test
    public void metodaTest() {
        HomePage homePage = new HomePage(getWebDriver());
        ElementsPage elementsPage = new ElementsPage(getWebDriver());
        WebTablesPage webTablesPage = new WebTablesPage(getWebDriver());
        PropertyUtility propertyUtility = new PropertyUtility("WebTableData");
        WebTableObject webTableObject = new WebTableObject(propertyUtility.getAllData());

        homePage.navigateToElementsPage();
        elementsPage.navigateToWebTablePage();

        webTablesPage.addNewEntry(webTableObject);

        PropertyUtility propertyUtilityModify = new PropertyUtility("WebTableDataModify");
        WebTableObject webTableObjectModify = new WebTableObject(propertyUtilityModify.getAllData());

        webTablesPage.editRecordButton(webTableObjectModify);

        webTablesPage.deleteRecord();
    }
}
