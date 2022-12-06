package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {

    By deskStopLink =By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");
    By addToCharButton = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
   // By textMessage = By.xpath("//option[contains(text(),'2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
    By ram =By.xpath("//select[@id='product_attribute_2']");
    By processor = By.xpath("//option[@value='5']");
    By hdd = By.xpath("//input[@id='product_attribute_3_7']");
    By os = By.xpath("//input[@id='product_attribute_4_9']");
   // By software = By.xpath("//label[contains(text(),'Microsoft Office [+$50.00]");
    //By addSoftware=By.xpath("//label[contains(text(),'Total Commander [+$5.00]");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");

    public void clickOnDeskStopLink(){
        clickOnElement(deskStopLink);
    }
    public void clickOnAddToChartButton(){clickOnElement(addToCharButton);}
    //public String verifyTextMessage() {return getTextFromElement(textMessage);}
    public void  selectOnRam(){clickOnElement(ram);}
    public void selectOnProcessor(){clickOnElement(processor);}
    public void selectOnHdd(){clickOnElement(hdd);}
    public void selectOs(){clickOnElement(os);}
   // public void selectSoftware(){clickOnElement(software);}
   // public void selectAddSoftware(){clickOnElement(addSoftware);

    public void clickOnAddCart(){clickOnElement(addToCart);}


}
