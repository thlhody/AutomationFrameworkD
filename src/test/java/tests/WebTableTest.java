package tests;

import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablesPage;
import shared.data.SharedData;

public class WebTableTest extends SharedData {

    @Test
    public void metodaTest() {
        HomePage homePage = new HomePage(getWebDriver());
        ElementsPage elementsPage = new ElementsPage(getWebDriver());
        WebTablesPage webTablesPage = new WebTablesPage(getWebDriver());

        homePage.navigateToElementsPage();
        elementsPage.navigateToWebTablePage();

        //creeam entry nou
        String firstNameValue = "Tudor";
        String lastNameValue = "Hody";
        String emailValue = "thlhody@gmail.com";
        String ageValue = "36";
        String salaryValue = "2500";
        String departmentValue = "QA";
        webTablesPage.addNewEntry(firstNameValue,lastNameValue,emailValue,ageValue,salaryValue,departmentValue);

        //modificam entry adaugat
        String modifyFirstNameValue = "Andrei";
        String modifyLastNameValue = "Vasile";
        String modifyEmailValue = "sarmalutza@gmail.com";
        String modifyAgeValue = "16";
        String modifySalaryValue = "4000";
        String modifyDepartamentValue = "IT serios";
        webTablesPage.editRecordButton(modifyFirstNameValue,modifyLastNameValue,modifyEmailValue,modifyAgeValue,modifySalaryValue,modifyDepartamentValue);

        //stergem entryul
        webTablesPage.deleteRecord();
    }
}
