package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.LoginPage;
import utils.SeleniumActions;
import utils.SeleniumBase;

public class SearchTests {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

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

    @Test
    public void checkThatUserLoggedInSuccessfully(){
        homePage.goToLoginPage();
        loginPage.login("Elbanna22","Test@123");
    }
}
