package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class singInPageObjects {
    private WebDriver driver;

    @FindBy(xpath = "//div[@id='nav-link-accountList']//a[contains(@class,'nav-progressive-attribute')]")
    private WebElement accountsAndList;

    @FindBy(xpath = "//a[@class='nav-action-signin-button']")
    private WebElement signInAccount;

    @FindBy(xpath = "//input[@id='ap_email_login']")
    private WebElement emailOrNumberField;

    @FindBy(xpath = "//input[@class='a-button-input']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement singInButton;

    public singInPageObjects(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement accountsAndList(){ return accountsAndList; }
    public WebElement signInAccount(){ return signInAccount; }
    public WebElement emailOrNumberField(){ return emailOrNumberField; }
    public WebElement continueButton(){ return continueButton; }
    public WebElement passwordField(){ return passwordField; }
    public WebElement singInButton(){ return singInButton; }

}
