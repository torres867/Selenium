package JUnit_16Oct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp_Page 
{
	ChromeDriver driver;  // Declaring a Global Variable
	
	// Launching the Browser 
	
	@Before
	
	public void Browser_Launch()
	{
		//Establishing the Connection with the Chrome Driver Exe File
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		
		// Creating the Object of the Chrome Driver Class
		driver = new ChromeDriver();
		
		// Hitting the URL
		driver.get("https://www.facebook.com");
		
		// Maximizing the Window 
		Options OP = driver.manage();
		Window W = OP.window();
		W.maximize();
		
	}
	
	// Automating the Sign Up Page
	
	@Test
	
	public void SignUp_Page_Automation() throws InterruptedException
	{
		// Create New Account
		WebElement account_btn = driver.findElement(By.linkText("Create New Account"));
		account_btn.click();
		Thread.sleep(5000);
		
		// First Name
		WebElement first_name = driver.findElement(By.name("firstname"));
		first_name.sendKeys("qatest");
		Thread.sleep(5000);
		
		// Last Name
		WebElement last_name = driver.findElement(By.cssSelector("input[name = 'lastname']"));
		last_name.sendKeys("app");
		Thread.sleep(5000);
		
		// Mobile Number or Email Address
		WebElement email_address = driver.findElement(By.cssSelector("input[name = 'reg_email__']"));
		email_address.sendKeys("qatest123456789@gmail.com");
		Thread.sleep(5000);
		
		// Re-enter Email Address
		WebElement reenter_email_address = driver.findElement(By.cssSelector("input[name = 'reg_email_confirmation__']"));
		reenter_email_address.sendKeys("qatest123456789@gmail.com");
		Thread.sleep(5000);
		
		// New Password
		WebElement new_password = driver.findElement(By.cssSelector("input#password_step_input"));
		new_password.sendKeys("qatest1234@");
		Thread.sleep(5000);
		
		// Date of Birth
		// Date
		WebElement date_dropdown = driver.findElement(By.id("day"));
		Select s1 = new Select(date_dropdown);
		s1.selectByIndex(27);
		Thread.sleep(5000);
		
		// Month 
		WebElement month_dropdown = driver.findElement(By.name("birthday_month"));
		Select s2 = new Select(month_dropdown);
		s2.selectByVisibleText("Nov");
		Thread.sleep(5000);
		
		// Year 
		WebElement year_dropdown = driver.findElement(By.id("year"));
		Select s3 = new Select(year_dropdown);
		s3.selectByValue("2014");
		Thread.sleep(5000);
		
		// Gender
		WebElement gender = driver.findElement(By.cssSelector("input[value = '2']"));
		gender.click();
		Thread.sleep(5000);
		
		// Sign Up Button
		WebElement sign_up_btn = driver.findElement(By.cssSelector("button[name = 'websubmit']"));
		sign_up_btn.click();
		Thread.sleep(5000);		
	}
	
	// Closing the Browser
	
	@After
	
	public void Browser_Close()
	{
		driver.close();
	}

}
