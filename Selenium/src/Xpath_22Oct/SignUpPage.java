package Xpath_22Oct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage 
{
	ChromeDriver driver;  // Declaring the Global Variable
	
	// Launching the Browser
	
	@Before
	
	public void Browser_Launch()
	{
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Options OP = driver.manage();
		Window W = OP.window();
		W.maximize();
	}
	
	// Automating the SignUp Page using XPath Technique
	
	@Test
	
	public void SignUp_Page_Automation() throws InterruptedException
	{
		// Create New Account Button
		WebElement create_new_account_btn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create_new_account_btn.click();
		Thread.sleep(5000);
		
	   // First Name
	   WebElement first_name = driver.findElement(By.xpath("//input[@name = 'firstname']"));
	   first_name.sendKeys("qatest");
	   Thread.sleep(5000);
	   
	   // Last Name
	   WebElement last_name = driver.findElement(By.xpath("//input[@name='lastname' and @data-type='text']"));
	   last_name.sendKeys("application");
	   Thread.sleep(5000);
	   
	   // Email Address
	   WebElement email_address = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
	   email_address.sendKeys("qatestapp654321@gmail.com");
	   Thread.sleep(5000);
	   
	   // Re-enter Email Address
	   WebElement reenter_email_address = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__' and @data-type ='text']"));
	   reenter_email_address.sendKeys("qatestapp654321@gmail.com");
	   Thread.sleep(5000);
	   
	   // New Password
	   WebElement new_password = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
	   new_password.sendKeys("qatest1234@");
	   Thread.sleep(5000);
	   
	   // Date of Birth
	   //Date
	   WebElement date_dropdown = driver.findElement(By.xpath("//select[@id='day']"));
	   Select s1 = new Select(date_dropdown);
	   s1.selectByIndex(26);
	   Thread.sleep(5000);
	   
	   //Month
	   WebElement month_dropdown = driver.findElement(By.xpath("//*[@*='birthday_month']"));
	   Select s2 = new Select(month_dropdown);
	   s2.selectByVisibleText("Oct");
	   Thread.sleep(5000);
	   
	   //Year
	   WebElement year_dropdown = driver.findElement(By.xpath("//*[@id='year']"));
	   Select s3 = new Select(year_dropdown);
	   s3.selectByValue("2000");
	   Thread.sleep(5000);
	   
	   //Gender
	   WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
	   gender.click();
	   Thread.sleep(5000);
	   
	   // SignUp Button
	   WebElement signup_btn = driver.findElement(By.xpath("//button[text()='Sign Up']"));
	   signup_btn.click();
	   Thread.sleep(5000);
	 }
	
	// Closing the Browser
	
	@After
	
	public void Browser_Close()
	{
		driver.close();
	}

}
