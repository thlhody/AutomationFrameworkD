package pages;

import object.data.WebTableObject;
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

    public void addNewEntry(WebTableObject webTableObject) {
        elementMethods.clickElement(addNewRecordButton);
        elementMethods.fillElement(firstNameField, webTableObject.getFirstNameValue());
        elementMethods.fillElement(lastNameField, webTableObject.getLastNameValue());
        elementMethods.fillElement(emailField, webTableObject.getEmailValue());
        elementMethods.fillElement(ageField, webTableObject.getAgeValue());
        elementMethods.fillElement(salaryField, webTableObject.getSalaryValue());
        elementMethods.fillElement(departmentField, webTableObject.getDepartmentValue());
        elementMethods.clickElement(submitButton);
    }
//refill
    public void editRecordButton(WebTableObject webTableObject) {
        elementMethods.clickElement(editFieldButton);
        elementMethods.reFillElement(firstNameField, webTableObject.getFirstNameValue());
        elementMethods.reFillElement(lastNameField, webTableObject.getLastNameValue());
        elementMethods.reFillElement(emailField, webTableObject.getEmailValue());
        elementMethods.reFillElement(ageField, webTableObject.getAgeValue());
        elementMethods.reFillElement(salaryField, webTableObject.getSalaryValue());
        elementMethods.reFillElement(departmentField, webTableObject.getDepartmentValue());
        elementMethods.clickElement(submitButton);
    }
    public void deleteRecord(){
        elementMethods.clickElement(deleteFieldButton);
    }
}
