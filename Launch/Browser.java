package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumApplication\\Selenium\\Browser\\chromedriver.exe");
		//working with chrome browser
		//the key is ==>webdriver.chrome.driver
			//object creation for webdriver
	WebDriver driver=new ChromeDriver();
		//this line code will launch the browser
		
		//using get method
		//using this get method we can launch the application
	driver.get("https://demowebshop.tricentis.com/register");
	driver.manage().window().maximize();
	driver.close();
	
	
	}

}
