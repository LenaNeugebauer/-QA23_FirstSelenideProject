package com.telran.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddContactPage extends PageBase{

    private By addTabLocator = By.xpath("//a[contains(text(),'ADD')]");
    private By nameLocator = By.cssSelector("input:nth-child(1)");
    private By lastNameLocator = By.cssSelector("input:nth-child(2)");
    private By phoneLocator = By.cssSelector("input:nth-child(3)");
    private By emailLocator = By.cssSelector("input:nth-child(4)");
    private By addressLocator = By.cssSelector("input:nth-child(5)");
    private By descLocator = By.cssSelector("input:nth-child(6)");
    private By saveTabLocator = By.cssSelector(".add_form__2rsm2 button");
    private By contactIsPresent = By.tagName("//h3[contains(text(),'049123456789')]");


    public void clickOnAddTab() {
        $(addTabLocator).click();
    }


    public void with(String name, String lastName, String phone, String email, String address, String desc) {

        $(nameLocator).val(name);
        $(lastNameLocator).val(lastName);
        $(phoneLocator).val(phone);
        $(emailLocator).val(email);
        $(addressLocator).val(address);
        $(descLocator).val(desc);
        $(saveTabLocator).click();
    }


    }

