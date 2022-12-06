package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;


public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By wishListLink = By.xpath("//span[contains(text(),'Wishlist')]");
    By shoppingChartLink = By.xpath("//span[contains(text(),'Shopping cart')]");
    By searchField = By.id("small-searchterms");
    By computersLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By electronicsLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By apparelLink = By.xpath(
            "//body/div[6]/div[2]/ul[1]/li[3]/a[1]");
    By digitalDownloadsLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]");
    By booksLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");
    By jewelryLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");
    By giftCardLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");
    //By imageLink =By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void enterTextToSearchField(String text){
        sendTextToElement(searchField, text);
    }
    public void clickOnWishList(){
     clickOnElement(wishListLink);
    }
    public void clickOnShoppingChartList(){
        clickOnElement(shoppingChartLink);
    }
    public void clickOnComputersLink(){
        clickOnElement(computersLink);
    }
    public void clickOnElectronicsLink(){
        clickOnElement(electronicsLink);
    }
    public void clickOnApparelLink(){
        clickOnElement(apparelLink);
    }
    public void clickOnDigitalDownloadsLink(){
        clickOnElement(digitalDownloadsLink);
    }
    public void clickOnBookLink(){clickOnElement(booksLink);}
    public void clickOnJewelryLink(){clickOnElement(jewelryLink);}
    public void clickOnGiftCardLink(){clickOnElement(giftCardLink);}
    //public void clickOnImageLink(){clickOnElement(imageLink);}

}
