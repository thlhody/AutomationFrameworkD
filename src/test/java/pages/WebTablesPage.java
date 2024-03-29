package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage{
    public WebTablesPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "addNewRecordButton")
    private WebElement addNewRecordButton;
    @FindBy(id = "firstName")
    private WebElement firstNameField;
    @FindBy(id = "lastName")
    private WebElement lastNameField;
    @FindBy(id = "userEmail")
    private WebElement emailField;
    @FindBy(id = "age")
    private WebElement ageField;
    @FindBy(id = "salary")
    private WebElement salaryField;
    @FindBy(id = "department")
    private  WebElement departmentField;
    @FindBy(id = "submit")
    private  WebElement submitButton;
    @FindBy(id = "edit-record-4")
    private WebElement editFieldButton;
    @FindBy(id = "delete-record-4")
    private WebElement deleteFieldButton;

    public void addNewEntry(String firstNameValue,String lastNameValue, String emailValue, String ageValue,String salaryValue,String departmentValue) {
        elementMethods.clickElement(addNewRecordButton);
        elementMethods.fillElement(firstNameField, firstNameValue);
        elementMethods.fillElement(lastNameField, lastNameValue);
        elementMethods.fillElement(emailField, emailValue);
        elementMethods.fillElement(ageField, ageValue);
        elementMethods.fillElement(salaryField, salaryValue);
        elementMethods.fillElement(departmentField, departmentValue);
        elementMethods.clickElement(submitButton);
    }
//refill
    public void editRecordButton(String firstNameValue,String lastNameValue, String emailValue, String ageValue,String salaryValue,String departmentValue) {
        elementMethods.clickElement(editFieldButton);
        elementMethods.reFillElement(firstNameField, firstNameValue);
        elementMethods.reFillElement(lastNameField, lastNameValue);
        elementMethods.reFillElement(emailField, emailValue);
        elementMethods.reFillElement(ageField, ageValue);
        elementMethods.reFillElement(salaryField, salaryValue);
        elementMethods.reFillElement(departmentField, departmentValue);
        elementMethods.clickElement(submitButton);
    }
    public void deleteRecord(){
        elementMethods.clickElement(deleteFieldButton);
    }
}
