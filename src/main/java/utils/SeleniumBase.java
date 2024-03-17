package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static utils.SeleniumConfigs.*;
import static utils.SeleniumConfigs.getValue;

public class SeleniumBase {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public SeleniumBase(){
    }

    public WebDriver seleniumConfig(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--disable-gpu");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        driver.manage().window().maximize();
        return driver;
    }

    public void environmentSetup(){
        String value = getValue();
        driver.get(value);
    }
}
