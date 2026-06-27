package com.TestNG.Scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;
import org.testng.Assert;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ornageHRM.Login;

public class LoginTest extends Login {

    @BeforeMethod
    public void init() {
        // initialize driver and open application
        setup();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Parameterized Test using TestNG parameters from testng.xml
    @Test
    @Parameters({"username", "password"})
    public void ValidLoginTest(@Optional("Admin") String user, @Optional("admin123") String pass) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for username field and input credentials
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();

        // Wait for dashboard to appear after login
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard));
        Assert.assertTrue(driver.findElement(dashboard).isDisplayed(), "Login Failed!");
    }
}