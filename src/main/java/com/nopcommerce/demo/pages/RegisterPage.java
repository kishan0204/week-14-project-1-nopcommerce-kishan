package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerButton = By.xpath("//a[contains(text(),'Register')]");
    By genderButton = By.xpath("//input[@id='gender-male']");
    By nameFieldLink = By.xpath("//input[@id='FirstName']");
    By lastNameFieldLink = By.xpath("//input[@id='FirstName']");
    By dateOfBirthDayField = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
    By dateOfBirthMonthField = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
    By dateOfBirthYearField = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
    By emailIdField =By.xpath("//input[@id='Email']");
    By companyField =By.xpath("//input[@id='Company']");
    By newsletterBox=By.xpath("//input[@id='Newsletter']");
    By passwordField =By.xpath("//input[@id='Password']");
    By confirmPasswordField =By.xpath("//input[@id='ConfirmPassword']");
    By registerButtonClick =By.xpath("//button[@id='register-button']");
    By verifyTextFromElementsText =By.xpath("//div[contains(text(),'Your registration completed')]");

   public void clickOnRegisterButton(){clickOnElement(registerButton);}
    public void  clickOnGenderButton(){clickOnElement(genderButton);}
    public void enterNameField (String name){sendTextToElement(nameFieldLink, name);}
    public void enterLastName (String lastname){sendTextToElement(lastNameFieldLink , lastname);}
    public void enterDateOfBirthDayField (String day){sendTextToElement(dateOfBirthDayField ,day);}
    public void enterDateOfBirthMonthField(String month){sendTextToElement(dateOfBirthMonthField,month);}
    public void enterDateOfBirthYearField(String year){sendTextToElement(dateOfBirthYearField,year);}
    public void enterEmailIdField(String email){sendTextToElement(emailIdField , email);}
    public void enterCompanyField(String companyName){sendTextToElement(companyField , companyName);}
    public void clickOnNewsBox(){clickOnElement(newsletterBox);}
    public void enterPasswordField(String password ){sendTextToElement(passwordField , password);}
    public void enterConfirmPasswordField(String confirmPassword){sendTextToElement(confirmPasswordField , confirmPassword);}
    public void clickOnRegisterButtonClick(){clickOnElement(registerButtonClick);}



}


