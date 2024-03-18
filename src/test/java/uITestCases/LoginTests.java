package uITestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.LoginPage;
import utils.SeleniumBase;

public class LoginTests {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @BeforeTest
    public void init() {
        SeleniumBase seleniumBase = new SeleniumBase();
        seleniumBase.seleniumConfig();
        seleniumBase.environmentSetup();
    }
    @Test
    public void checkThatUserLoggedInSuccessfully(){
        homePage.goToLoginPage();
        loginPage.login("Elbanna22","Test@123");
    }
}
