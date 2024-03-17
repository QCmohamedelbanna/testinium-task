package pom;

import org.testng.Assert;
import utils.Locators;
import utils.SeleniumActions;
import utils.SeleniumBase;

import static utils.SeleniumActions.Waits.ELEMENT_TO_BE_CLICKABLE;

public class LoginPage extends SeleniumBase {
    SeleniumActions actions = new SeleniumActions();
    Locators locators = new Locators();

    public void login(String username, String password){
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.userNameFld);
        actions.clear(locators.userNameFld);
        actions.sendKeys(locators.userNameFld,username);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.passwordFld);
        actions.clear(locators.passwordFld);
        actions.sendKeys(locators.passwordFld,password);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.loginBtn);
        actions.click(locators.loginBtn);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.accountNameTxt);
        String actualResult = actions.getText(locators.accountNameTxt);
        System.out.println(actualResult);
        Assert.assertEquals(actualResult,username,"User didn't Log in Successfully");
    }
}
