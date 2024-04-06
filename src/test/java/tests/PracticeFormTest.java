package tests;

import objectData.PracticeFormObject;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import propertyUtility.PropertyUtility;
import sharedData.SharedData;

public class PracticeFormTest extends SharedData {

    @Test
    public void metodaTest() {
        HomePage homePage = new HomePage(getWebDriver());
        FormsPage formsPage = new FormsPage(getWebDriver());
        PracticeFormPage practiceFormPage = new PracticeFormPage(getWebDriver());
        PropertyUtility propertyUtility = new PropertyUtility("PracticeFormData");
        PracticeFormObject practiceFormObject = new PracticeFormObject(propertyUtility.getAllData());


        homePage.navigateToFormsPage();
        formsPage.navigateToPracticeFormPage();
//completam formular
        practiceFormPage.fillEntireForm(practiceFormObject);
//validari
        practiceFormPage.validatePracticeFormTable(practiceFormObject);
    }
}
