package JUnit_16Oct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {
	
	ChromeDriver driver;     // Declaring the driver as Global Variable
	
	// Launching the Browser
	
	@Before
	public void Browser_Code()
	{
		// Establishing the Connection with Chrome Driver Exe file
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		
		// Hitting the URL
		driver.get("https://www.facebook.com");
		
		// Maximizing the Browser
		Options OP = driver.manage();
		Window W = OP.window();
		W.maximize();
	}
		
	// Automating the Login Page 
	
	@Test
	public void Login_Page_Code() throws InterruptedException
	{
		// Email Address or Phone Number
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("qatestapp123456@gmail.com");
		Thread.sleep(5000);
		
		//Password
		WebElement password = driver.findElement(By.cssSelector("input#pass"));
		password.sendKeys("qatest1234@");
		Thread.sleep(5000);
		
		// Login Button or SignIn Button
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		Thread.sleep(5000);
	}
	
	// Closing the Browser
		
	@After
	public void browser_close() 
	{
	    driver.close();
	}
		
		

}
