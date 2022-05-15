package com.telran.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends PageBase {

    private By homeComponentLocator = By.xpath("//h1[.='Home Component']");

    public void isComponentPresent() {
        $(homeComponentLocator).shouldBe(Condition.visible);
    }
}