package HittingURL_and_MaximizingBrowser_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_1 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	// Establishing the connection for executing the code on browser using chrome exe file
    	System.setProperty("webdriver.chrome.driver","../Selenium/chromedriver.exe");
    	
    	// Create the object of the ChromeDriver
    	ChromeDriver driver = new ChromeDriver();
    	
    	//Hitting the URL
    	driver.get("https://www.facebook.com");  
    	
	}
}
