package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumActions extends  SeleniumBase{
    public SeleniumActions(){}
    public void click(By path) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement Click = driver.findElement(path);
        waitUntil(Waits.ELEMENT_TO_BE_CLICKABLE,path);
        //wait.until(ExpectedConditions.elementToBeClickable(path));
        Click.click();
    }
    public void sendKeys(By path, String text) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement SendKey = driver.findElement(path);
        SendKey.sendKeys(text);
    }
    public void sendKeysAndEnter(By path, String text){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement sendKey = driver.findElement(path);
        sendKey.sendKeys(text + Keys.ENTER);
    }
    public String getText(By path) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement GetText = driver.findElement(path);
        return GetText.getText();
    }
    public void clear(By path) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement ClearText = driver.findElement(path);
        ClearText.clear();
    }
    public boolean isDisplayed(By path){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement isDisplayed = driver.findElement(path);
        return isDisplayed.isDisplayed();
    }

    public void waitUntil(Waits waits, By path) {
        switch (waits) {
            case VISIBILITY_OF_ELEMENT:
                wait.until(ExpectedConditions.visibilityOfElementLocated(path));
                break;
            case ELEMENT_TO_BE_CLICKABLE:
                wait.until(ExpectedConditions.elementToBeClickable(path));
                break;
        }
    }
    public enum Waits {
        VISIBILITY_OF_ELEMENT,
        ELEMENT_TO_BE_CLICKABLE
    }

}
