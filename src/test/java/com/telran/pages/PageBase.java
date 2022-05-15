package com.telran.pages;

import com.codeborne.selenide.Condition;
import com.telran.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageBase {

    private static String url = PropertiesLoader.loadProperty("url");
    private static String email  = PropertiesLoader.loadProperty("valid.email");
    private static String password = PropertiesLoader.loadProperty("valid.password");

    public PageBase() {
        open(url);
    }

    private By loginTabLocator = By.xpath("//a[.='LOGIN']");
    public void clickOnLoginTab() {
        $(loginTabLocator).click();
    }

    private By emailLocator = By.cssSelector("[placeholder='Email']");
    private By passwordLocator = By.cssSelector("[placeholder='Password']");
    private By loginButtonLocator = By.xpath("//button[.=' Login']");

    public void with(String email, String password) {
        $(emailLocator).val(email);
        $(passwordLocator).val(password);
        $(loginButtonLocator).click();
    }

    private By signOutButtonLocator = By.xpath("//button[.='Sign Out']");

    public void validLogin() {
        $(signOutButtonLocator).shouldBe(Condition.visible);
    }
}