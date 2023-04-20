package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loop {

	public static void main(String[] args) throws Exception {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://amazon.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=10;i++) {
			js.executeScript("window.scrollBy(0,650)");
			Thread.sleep(3000);
		}
		for(int j=0;j<=10;j++) {
			js.executeScript("window.scrollBy(0,-650)");
			Thread.sleep(3000);
		}
		driver.close();
	}

}
