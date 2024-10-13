package com.store.utils;

import com.store.factory.RegisterFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Hooks extends Base {

    @Before
    public static void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT));
        registerFactory = new RegisterFactory(driver);
    }

    @AfterAll
    public static void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}