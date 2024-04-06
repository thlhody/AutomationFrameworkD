package pages;

import objectData.PracticeFormObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstNameField;
    @FindBy(css = "input[placeholder='Last Name']")
    private WebElement lastNameField;
    @FindBy(id = "userEmail")
    private WebElement emailField;
    @FindBy(css = "label[for='gender-radio-1']")
    private WebElement genderMale;
    @FindBy(css = "label[for='gender-radio-2']")
    private WebElement genderFemale;
    @FindBy(css = "label[for='gender-radio-3']")
    private WebElement genderOther;
    @FindBy(id = "userNumber")
    private WebElement mobileField;
    @FindBy(css = ".react-datepicker__input-container")
    private WebElement dobField;
    @FindBy(css = ".react-datepicker__month-select")
    private WebElement monthField;
    @FindBy(css = ".react-datepicker__year-select")
    private WebElement yearField;
    @FindBy(xpath = "//div[not(contains(@class,'outside-month')) and contains(@class,'react-datepicker__day react-datepicker__day')]")
    private List<WebElement> dayFields;
    @FindBy(id = "subjectsInput")
    private WebElement subjectsField;
    @FindBy(xpath = "//div[contains(@class, 'custom-checkbox')]")
    private List<WebElement> hobbiesListA;
    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    private List<WebElement> hobbiesListB;
    @FindBy(id = "uploadPicture")
    private WebElement pictureField;
    @FindBy(id = "currentAddress")
    private WebElement addressField;
    @FindBy(xpath = "//div[text()='Select State']")
    private WebElement selectStateField;
    @FindBy(id = "react-select-3-input")
    private WebElement selectState;
    @FindBy(xpath = "//div[text()='Select City']")
    private WebElement selectCityField;
    @FindBy(id = "react-select-4-input")
    private WebElement selectCity;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindBy(xpath = "//table/tbody/tr/td[1]")
    private List<WebElement> rowLabel;
    @FindBy(xpath = "//table/tbody/tr/td[2]")
    private List<WebElement> rowValue;

    public void fillFirstName(String firstNameValue) {
        elementMethods.fillElement(firstNameField, firstNameValue);
    }

    public void fillLastName(String lastNameValue) {
        elementMethods.fillElement(lastNameField, lastNameValue);
    }

    public void fillEmail(String emailValue) {
        elementMethods.fillElement(emailField, emailValue);
    }

    public void fillGender(String genderValue) {
        if (Objects.equals(genderValue, "Male")) {
            elementMethods.clickElement(genderMale);
        } else if (Objects.equals(genderValue, "Female")) {
            elementMethods.clickElement(genderFemale);
        } else {
            elementMethods.clickElement(genderOther);
        }
    }

    public void fillMobile(String mobileValue) {
        elementMethods.fillElement(mobileField, mobileValue);
    }

    public void fillDob(String dobDayValue, String dobMonthValue, String dobYearValue) {
        elementMethods.clickElement(dobField);
        elementMethods.selectElementText(monthField, dobMonthValue);
        elementMethods.selectElementValue(yearField, dobYearValue);
        for (int i = 0; i < dayFields.size(); i++) {
            if (dayFields.get(i).getText().equals(dobDayValue)) {
                elementMethods.clickElemForce(dayFields.get(i));
                break;
            }
        }
    }

    public void fillSubject(String subjectValue) {
        elementMethods.scrollElemByPixel(0, 450);
        elementMethods.fillPressElem(subjectsField, subjectValue, Keys.ENTER);
    }

    public void fillHobbie(List<String> hobbies) {
        for (int i = 0; i < hobbiesListB.size(); i++) {
            String currentElementText = hobbiesListB.get(i).getText();
            if (hobbies.contains(currentElementText)) {
                elementMethods.clickElemForce(hobbiesListB.get(i));
//                hobbiesListB.get(i).click();
            }
        }
    }

    public void fillPicture(String pictureLocation) {
        elementMethods.fillElement(pictureField, new File(pictureLocation).getAbsolutePath());
    }

    public void fillAddres(String addressValue) {
        elementMethods.fillElement(addressField, addressValue);
    }

    public void fillState(String selectStateValue) {
        elementMethods.scrollElemByPixel(0, 450);
        elementMethods.clickElemForce(selectStateField);
        elementMethods.fillPressElem(selectState, selectStateValue, Keys.ENTER);
    }

    public void fillCity(String selectCityValue) {
        elementMethods.scrollElemByPixel(0, 450);
        elementMethods.clickElemForce(selectCityField);
        elementMethods.fillPressElem(selectCity, selectCityValue, Keys.ENTER);
    }

    public void clickSubmit() {
        elementMethods.clickElemForce(submitButton);
    }

    public void fillEntireForm(PracticeFormObject pFO) {
//First Name 0.1
        fillFirstName(pFO.getFirstNameValue());
//Last Name 0.2
        fillLastName(pFO.getLastNameValue());
//Email 1
        fillEmail(pFO.getEmailValue());
//Gender 2
        fillGender(pFO.getGenderValue());
//Mobile 3
        fillMobile(pFO.getMobileValue());
//Date Of Birth 4
        fillDob(pFO.getDobDayValue(), pFO.getDobMonthValue(), pFO.getDobYearValue());
//Subjects 5
        fillSubject(pFO.getSubjectValue());
//Hobbies 6
        fillHobbie(pFO.getHobbies());
//Picture 7
        fillPicture(pFO.getPictureLocation());
//Current Address 8
        fillAddres(pFO.getAddressValue());
//State 9.1
        fillState(pFO.getSelectStateValue());
//City 9.2
        fillCity(pFO.getSelectCityValue());
//submit
        clickSubmit();
    }

    public void validatePracticeFormTable(PracticeFormObject pFo) {
        Assert.assertEquals(rowLabel.get(0).getText(), "Student Name");
        Assert.assertEquals(rowLabel.get(1).getText(), "Student Email");
        Assert.assertEquals(rowLabel.get(2).getText(), "Gender");
        Assert.assertEquals(rowLabel.get(3).getText(), "Mobile");
        Assert.assertEquals(rowLabel.get(4).getText(), "Date of Birth");
        Assert.assertEquals(rowLabel.get(5).getText(), "Subjects");
        Assert.assertEquals(rowLabel.get(6).getText(), "Hobbies");
        Assert.assertEquals(rowLabel.get(7).getText(), "Picture");
        Assert.assertEquals(rowLabel.get(8).getText(), "Address");
        Assert.assertEquals(rowLabel.get(9).getText(), "State and City");

        Assert.assertEquals(rowValue.get(0).getText(), pFo.getFirstNameValue() + " " + pFo.getLastNameValue());
        Assert.assertEquals(rowValue.get(1).getText(), pFo.getEmailValue());
        Assert.assertEquals(rowValue.get(2).getText(), pFo.getGenderValue());
        Assert.assertEquals(rowValue.get(3).getText(), pFo.getMobileValue());

        String dobDayValueFormatted;
        if (Integer.parseInt(pFo.getDobDayValue()) <= 9) {
            dobDayValueFormatted = "0" + pFo.getDobDayValue();
        } else {
            dobDayValueFormatted = pFo.getDobDayValue();
        }
        Assert.assertEquals(rowValue.get(4).getText(), dobDayValueFormatted + " " + pFo.getDobMonthValue() + "," + pFo.getDobYearValue());

        Assert.assertEquals(rowValue.get(5).getText(), pFo.getSubjectValue());
        for (int i = 0; i < pFo.getHobbies().size(); i++) {
            Assert.assertTrue(rowValue.get(6).getText().contains(pFo.getHobbies().get(i)));
        }

        String[] arrayFileName = pFo.getPictureLocation().split("/");
        Integer desireIndex = arrayFileName.length - 1;
        elementMethods.validateElementText(rowValue.get(7), arrayFileName[desireIndex]);

        Assert.assertEquals(rowValue.get(8).getText(), pFo.getAddressValue());
        Assert.assertEquals(rowValue.get(9).getText(), pFo.getSelectStateValue() + " " + pFo.getSelectCityValue());
    }
}
