package com.telran.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.confirm;

public class LoginPage extends PageBase{

    private By loginTabLocator = By.xpath("//a[.='LOGIN']");
    private By emailLocator = By.cssSelector("[placeholder='Email']");
    private By passwordLocator = By.cssSelector("[placeholder='Password']");
    private By loginButtonLocator = By.xpath("//button[.=' Login']");
    private By signOutButtonLocator = By.xpath("//button[.='Sign Out']");
    private By loginFailedTextLocator = By.cssSelector(".login_login__3EHKB > div");

    public void clickOnLoginTab() {
        $(loginTabLocator).click();
    }

    public void with(String email, String password) {
        $(emailLocator).val(email);
        $(passwordLocator).val(password);
        $(loginButtonLocator).click();
    }

    public void validLogin() {
        $(signOutButtonLocator).shouldBe(Condition.visible);
    }

    public void invalidLogin() {
        confirm();
        $(loginFailedTextLocator).shouldBe(Condition.visible);
        System.out.println($(loginFailedTextLocator));
    }
}