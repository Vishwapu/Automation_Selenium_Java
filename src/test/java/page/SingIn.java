package page;

import base.baseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.singInPageObjects;
import org.testng.annotations.*;

public class SingIn extends baseTest {



    @Test
    public void userSingIn() throws InterruptedException {

        singInPageObjects singInPageObjects= new singInPageObjects(driver);
        Actions actions= new Actions(driver);
        actions.moveToElement(singInPageObjects.accountsAndList()).perform();
        singInPageObjects.signInAccount().click();
        Thread.sleep(5000);
        singInPageObjects.emailOrNumberField().sendKeys("test-tipoca+0-1762424730147lFIj@amazon.com");
        singInPageObjects.continueButton().click();
        Thread.sleep(5000);

        singInPageObjects.passwordField().sendKeys("jgkbdg4fv#pmybbi");
        singInPageObjects.singInButton().click();
    }
}
