package pom;

import org.testng.Assert;
import utils.Locators;
import utils.SeleniumActions;
import utils.SeleniumBase;

import static utils.SeleniumActions.Waits.ELEMENT_TO_BE_CLICKABLE;


public class HomePage extends SeleniumBase {
    SeleniumActions actions = new SeleniumActions();
    Locators locators = new Locators();

    public void searchForText(String text){
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.searchTextFld);
        actions.clear(locators.searchTextFld);
        actions.sendKeys(locators.searchTextFld,text);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.searchBtn);
        actions.click(locators.searchBtn);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.searchResultTxt);
        String actualResult = actions.getText(locators.searchResultTxt);
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, text,"Search text didn't match with the search result");
    }
    public void goToLoginPage(){
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.loginLinkBtn);
        actions.click(locators.loginLinkBtn);
        String actualResult = actions.getText(locators.loginTxt);
        String expectedResult = "Log in";
        Assert.assertEquals(actualResult,expectedResult,"Link didn't navigate to Login Page");
    }
}
