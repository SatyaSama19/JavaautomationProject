package com.ornageHRM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Satyajit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.getTitle();
		String exepected_Title= "orangehrm";
		//System.out.println("This is correct :"+"orangeHRM");
		String actual_Title="orange";
		//System.out.println("This is not correct :"+"orange");
		if(exepected_Title.equals("orangehrm"))
		{
			System.out.println("This is correct :"+"orangeHRM");
		}
		else
		{
			System.out.println("This is notcorrect :"+"orange");
		}


	}

}
