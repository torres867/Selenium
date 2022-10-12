package HittingURL_and_MaximizingBrowser_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy_2 
{
	public static void main(String[] args) 
	{
		// Establishing the connection using the Chrome Exe File
		System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
		
		// Creating a chrome driver object
		ChromeDriver driver = new ChromeDriver();
		
		// Hitting the Swiggy URL
		driver.get("https://www.swiggy.com");  //with return type as void and belong to Remote Web Driver
		
		// Maximizing the Browser
		driver.manage().window().maximize();
		
	}

}
