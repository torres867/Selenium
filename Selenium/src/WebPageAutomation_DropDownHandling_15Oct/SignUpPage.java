package WebPageAutomation_DropDownHandling_15Oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Launching the Browser

public class SignUpPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Establishing the Connection
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		
		// Creating the Object of the ChromeDriver Class
		ChromeDriver driver = new ChromeDriver();
		
		// Hitting the URL
		driver.get("https://www.facebook.com");
		
		// Maximizing the URL
		Options OP = driver.manage();
		Window W = OP.window();
		W.maximize();
		
// Automation of the Sign Up Page
		
        // Create New Account Button Web Element
		WebElement Create_Account = driver.findElement(By.linkText("Create New Account"));
		Create_Account.click();
		Thread.sleep(5000);
	
        //  First Name Web Element
		WebElement First_Name = driver.findElement(By.cssSelector("input[name = 'firstname']"));   
		First_Name.sendKeys("qatest");
		Thread.sleep(5000);

        // Last Name Web Element
		WebElement Last_Name = driver.findElement(By.name("lastname"));
		Last_Name.sendKeys("app");
		Thread.sleep(5000);
		
		// Email Address or Phone Number
		WebElement EmailAddress = driver.findElement(By.cssSelector("input[name = 'reg_email__']"));
		EmailAddress.sendKeys("qatestapp123456@gmail.com");
		Thread.sleep(5000);
		
		// Re-enter Email Address
		WebElement ReenterEmailAddress = driver.findElement(By.cssSelector("input[name = 'reg_email_confirmation__'"));
		ReenterEmailAddress.sendKeys("qatestapp123456@gmail.com");
		Thread.sleep(5000);
		
		//New Password
		WebElement New_Password = driver.findElement(By.cssSelector("input[id = 'password_step_input']"));
		New_Password.sendKeys("qatest1234@");
		Thread.sleep(5000);
		
		// Drop Down Handling
	    //Date Drop down
		WebElement DropDown_Date = driver.findElement(By.id("day"));
		
		// In the Drop Down Select tag is there, So Select Class is used 
		Select S1 = new Select(DropDown_Date);
		
		// For Select Tag Drop Down using Select by Index Technique
		S1.selectByIndex(19);
		Thread.sleep(5000);
		
		// Month Drop Down
		WebElement DropDown_Month = driver.findElement(By.cssSelector("select#month"));
		Select S2 = new Select(DropDown_Month);
		
		// For Select Tag Drop Down using Select by Visible Text Technique
		S2.selectByVisibleText("Nov");
		Thread.sleep(5000);
		
		// Year DropDown
		WebElement DropDown_Year = driver.findElement(By.cssSelector("select[id = 'year']"));
		Select S3 = new Select(DropDown_Year);
		
		// For Select Tag DropDown using Select by Value Technique
		S3.selectByValue("1997");
		Thread.sleep(5000);
		
		// Gender
		WebElement Gender = driver.findElement(By.cssSelector("input[value = '2']"));
		Gender.click();
		Thread.sleep(5000);
		
		// SignUp Button
		WebElement SignUp_Btn = driver.findElement(By.cssSelector("button[name = 'websubmit']"));
		SignUp_Btn.click();
		Thread.sleep(5000);
	}

}
