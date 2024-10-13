package com.store.factory;

import com.store.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterFactory extends Base {

    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]")
    WebElement btnDismis;
    @FindBy(how = How.ID, using = "emailControl")
    WebElement inputEmail;
    @FindBy(how = How.ID, using = "passwordControl")
    WebElement inputPass;
    @FindBy(how = How.ID, using = "repeatPasswordControl")
    WebElement inputRePass;
    @FindBy(how = How.XPATH, using = "//*[@id=\"registration-form\"]/div[1]/mat-form-field[1]/div/div[1]/div[3]")
    WebElement clickSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mat-option-1\"]/span")
    WebElement optionSelect;
    @FindBy(how = How.ID, using = "securityAnswerControl")
    WebElement inputAnswer;
   // @FindBy(how = How.XPATH, using = "//*[@id=\"registerButton\"]")
   // @FindBy(how = How.ID, using = "registerButton")
    @FindBy(how = How.CSS, using = "registerButton")
    WebElement btnRegister;



    public RegisterFactory(WebDriver driver) {
        Base.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void alertDismis(){
        btnDismis.click();
    }

    public void fillOutForm(String email, String password, String repeatPassword, String securityAnswer) {

        inputEmail.sendKeys(email);
        inputPass.sendKeys(password);
        inputRePass.sendKeys(repeatPassword);
        clickSelect.click();
        optionSelect.click();
        inputAnswer.sendKeys(securityAnswer);
    }

    public void clickRegister() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", btnRegister);

        btnRegister.click();

    }

}