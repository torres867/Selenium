package WebPageAutomation_DropDownHandling_15Oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
          
           // Launching the Browser

public class LoginPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Establishing the Connection
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		
		// Creating the object of the ChromeDriver Class
		ChromeDriver driver = new ChromeDriver();
		
		// Hitting the URL
		driver.get("https://www.facebook.com");
		
		//Maximizing the Browser
		Options OP = driver.manage();
		Window W = OP.window();
		W.maximize();
		
	// Now Automating the Facebook Login Page
		
	// Email Address or Phone Number
		WebElement email = driver.findElement(By.id("email"));   // To uniquely identify the web element
		email.sendKeys("qatestapp123456@gmail.com");  // Performing an action
		Thread.sleep(3000);
		
	// Password
		WebElement Password = driver.findElement(By.cssSelector("input#pass"));
		Password.sendKeys("qatest1234@");
		Thread.sleep(3000);
		
   //  Login Button
		WebElement Btn = driver.findElement(By.name("login"));
		Btn.click();
		Thread.sleep(3000);
	}
}
