package com.telran.tests;

import com.telran.pages.AddContactPage;
import com.telran.pages.HomePage;
import com.telran.utils.PropertiesLoader;
import org.junit.Before;
import org.junit.Test;

public class AddContactsTests {

    AddContactPage addContactPage;

    private static String setName = PropertiesLoader.loadProperty("valid.name");
    private static String setLastName = PropertiesLoader.loadProperty("valid.lastName");
    private static String setPhone = PropertiesLoader.loadProperty("valid.phone");
    private static String setEmail = PropertiesLoader.loadProperty("email");
    private static String setAddress = PropertiesLoader.loadProperty("valid.address");
    private static String setDesc = PropertiesLoader.loadProperty("valid.desc");

    private static String validEmail = PropertiesLoader.loadProperty("valid.email");

    private static String validPassword = PropertiesLoader.loadProperty("valid.password");

    @Before
    public void setUp(){

        addContactPage = new AddContactPage();
    }

    @Test
    public void addContactPositiveTest(){
        addContactPage.clickOnLoginTab();
        addContactPage.with(validEmail, validPassword);
        addContactPage.clickOnAddTab();
        addContactPage.with(setName, setLastName, setPhone, setEmail, setAddress, setDesc);


    }
}
