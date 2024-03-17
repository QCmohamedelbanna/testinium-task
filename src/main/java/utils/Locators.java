package utils;

import org.openqa.selenium.By;

public class Locators {

    public By searchTextFld = By.xpath("//input[@placeholder='Search Wikipedia']");
    public By searchBtn = By.xpath("//button[text()='Search']");
    public By searchResultTxt = By.cssSelector("h1[id='firstHeading'] span");
    public By loginLinkBtn = By.xpath("//nav[@aria-label='Personal tools']//div[4]//li[2]");
    public By loginTxt = By.cssSelector("main[id='content'] h1");
    public By userNameFld = By.cssSelector("input[placeholder='Enter your username']");
    public By passwordFld = By.cssSelector("input[placeholder='Enter your password']");
    public By loginBtn = By.cssSelector("button[type='submit']");
    public By accountNameTxt = By.cssSelector("li[id='pt-userpage-2'] span");
}
