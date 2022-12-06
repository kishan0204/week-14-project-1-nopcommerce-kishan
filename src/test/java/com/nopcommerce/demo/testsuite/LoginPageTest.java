package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.InvalidLogingPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    InvalidLogingPage loginPage = new InvalidLogingPage();

    RegisterPage registerPage = new RegisterPage();
    ComputersPage computersPage=new ComputersPage();


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnLoginLink();
        homePage.clickOnWishList();
        homePage.clickOnShoppingChartList();
        homePage.clickOnComputersLink();
        homePage.clickOnElectronicsLink();
        homePage.clickOnApparelLink();
        homePage.clickOnDigitalDownloadsLink();
        homePage.clickOnBookLink();
        homePage.clickOnJewelryLink();
        homePage.clickOnGiftCardLink();
        //homePage.clickOnImageLink();

//        String expectedText = "Welcome, Please Sign In!";
//        String actualText = loginPage.getWelcomeText();
//        Assert.assertEquals(actualText, expectedText, "Login page not displayed");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("test123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        Assert.assertEquals(loginPage.getErrorMessage(),expectedErrorMessage, "Error message not displayed");
    }
    @Test
    public void VerifyRegister(){
        registerPage.clickOnRegisterButton();
        registerPage.clickOnRegisterButtonClick();
        registerPage.enterNameField("kishan");
        registerPage.enterLastName("malaviya");
        registerPage.enterDateOfBirthDayField("2");
        registerPage.enterDateOfBirthMonthField("February");
        registerPage.enterDateOfBirthYearField("1989");
        registerPage.enterEmailIdField("kishan_0201@yahoo.co.in");
        registerPage.enterCompanyField("kbbrotherltd");
        registerPage.clickOnNewsBox();
        registerPage.enterPasswordField("Vivek241990");
        registerPage.enterConfirmPasswordField("Vivek241990");
        registerPage.clickOnRegisterButton();


    }
    @Test
    public void buildComputer() throws InterruptedException {
        homePage.clickOnComputersLink();
        computersPage.clickOnDeskStopLink();
        computersPage.clickOnAddToChartButton();
//       String expectedMessage ="Build your own computer"+"";
//       Assert.assertEquals(computersPage.verifyTextMessage(),expectedMessage,"");
       computersPage.selectOnRam();
       computersPage.selectOnProcessor();
       computersPage.selectOnHdd();
       computersPage.selectOs();
        Thread.sleep(1500);
        //computersPage.selectAddSoftware();
       //computersPage.selectSoftware();
       computersPage.clickOnAddCart();

    }

}
