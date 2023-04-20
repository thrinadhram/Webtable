package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class position {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://amazon.in");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,950)", "");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
