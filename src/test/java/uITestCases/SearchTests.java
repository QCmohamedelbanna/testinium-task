package uITestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.HomePage;
import utils.SeleniumBase;

public class SearchTests {

    HomePage homePage = new HomePage();


    @BeforeTest
    public void init() {
        SeleniumBase seleniumBase = new SeleniumBase();
        seleniumBase.seleniumConfig();
        seleniumBase.environmentSetup();
    }

    @Test
    public void checkThatAppRedirectedToTheSearchedText(){
        homePage.searchForText("Barcelona");
    }


}
