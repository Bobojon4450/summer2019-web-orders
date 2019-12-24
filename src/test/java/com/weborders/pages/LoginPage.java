package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "ctl00_MainContent_username")
    public WebElement userNameTextBox;

    @FindBy(css = "#ctl00_MainContent_password")
    public WebElement passwordTextBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement submitButton;

    public static void main(String[] args) {
        Driver.getDriver().get(ConfigurationReader.get("url"));
    }

}

