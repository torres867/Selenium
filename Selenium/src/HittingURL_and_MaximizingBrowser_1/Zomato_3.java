package HittingURL_and_MaximizingBrowser_1;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_3 
{
	public static void main(String[] args) 
	{
		// Establishing the Connection using the Chrome Exe File
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		
		// Creating the Object of the Chrome Driver Class
		ChromeDriver driver = new ChromeDriver();
		
		// Hitting the Zomato URL
		driver.get("https://www.zomato.com"); // Void return type and belong to Remote WebDriver class
		
	    // Creating the Object of the Options Class 
		Options OP = driver.manage();
		
		// Creating the Object of the Window Class
		Window W = OP.window();
		
		//Maximizing the Browser belong to the Window Class
		W.maximize();
		
	}

}
