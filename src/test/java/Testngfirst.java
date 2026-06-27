import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngfirst 
{
	@Test
	public void TestGoogle() throws Exception 
	{
		  //ChromeOptions options = new ChromeOptions();
		  //options.addArguments("--remote-allow-origins=*");
		  //WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Satyajit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.findElement(By.name("q")).sendKeys("amazon", Keys.ENTER);
		  System.out.println(driver.getTitle());
		  Thread.sleep(1000);
		  driver.quit();
	}
	
	@Test
	public void TestFacebook() throws Exception {
		  //ChromeOptions options = new ChromeOptions();
		  //options.addArguments("--remote-allow-origins=*");
		  //WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Satyajit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.name("email")).sendKeys("xyz", Keys.ENTER);
		  System.out.println(driver.getTitle());
		  Thread.sleep(1000);
		  driver.quit();
	}

}
