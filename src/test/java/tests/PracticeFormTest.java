package tests;

import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import shared.data.SharedData;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {

    @Test
    public void metodaTest() {
        HomePage homePage = new HomePage(getWebDriver());
        FormsPage formsPage = new FormsPage(getWebDriver());
        PracticeFormPage practiceFormPage = new PracticeFormPage(getWebDriver());

        homePage.navigateToFormsPage();
        formsPage.navigateToPracticeFormPage();

        String firstNameValue = "Tudor";
        String lastNameValue = "Hody";
        String emailValue = "thlhody@gmail.com";
        String genderValue = "Male";
        String mobileValue = "0123456789";
        String dobDayValue = "9";
        String dobMonthValue = "June";
        String dobYearValue = "1988";
        String subjectValue = "Economics";
        List<String> hobbies = Arrays.asList("Sports", "Reading", "Music");
        File pictureLocation = new File("src/test/resources/uploadpic.jpg");
        String addressValue = "Strada X Nr 1 Ap 0";
        String selectStateValue = "Uttar Pradesh";
        String selectCityValue = "Lucknow";

//First Name 0.1
        practiceFormPage.fillFirstName(firstNameValue);
//Last Name 0.2
        practiceFormPage.fillLastName(lastNameValue);
//Email 1
        practiceFormPage.fillEmail(emailValue);
//Gender 2
        practiceFormPage.fillGender(genderValue);
//Mobile 3
        practiceFormPage.fillMobile(mobileValue);
//Date Of Birth 4
        practiceFormPage.fillDob(dobDayValue, dobMonthValue, dobYearValue);
//Subjects 5
        practiceFormPage.fillSubject(subjectValue);
//Hobbies 6
        practiceFormPage.fillHobbie(hobbies);
//Picture 7
        practiceFormPage.fillPicture(pictureLocation);
//Current Address 8
        practiceFormPage.fillAddres(addressValue);
//State 9.1
        practiceFormPage.fillState(selectStateValue);
//City 9.2
        practiceFormPage.fillCity(selectCityValue);
//submit
        practiceFormPage.clickSubmit();
//validari
        practiceFormPage.validatePracticeFormTable(firstNameValue,lastNameValue,emailValue,genderValue,mobileValue,dobDayValue,
                dobMonthValue,dobYearValue,subjectValue,hobbies,pictureLocation,addressValue,selectStateValue,selectCityValue);
    }
}
