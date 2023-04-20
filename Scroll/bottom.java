package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bottom {

	public static void main(String[] args) throws Exception {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://amazon.in");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,document.body.scrollHeight)","");
		Thread.sleep(2000);
		driver.close();
	}

}
