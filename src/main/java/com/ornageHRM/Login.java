package com.ornageHRM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

    public WebDriver driver;

    // Locators (make them global)
    // Use the actual attribute names used by the OrangeHRM demo site (lowercase)
    public By username = By.name("username");
    public By password = By.name("password");
    // Use a relative selector for the login button to be more resilient
    public By loginBtn = By.xpath("//button[@type='submit']");
    public By dashboard = By.xpath("//h6[text()='Dashboard']");

    // Setup method
    public void setup() {
        // Use WebDriverManager (declared in pom.xml) so we don't rely on a local chromedriver path
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        // Recommended for newer Chrome versions to avoid remote origin errors
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}