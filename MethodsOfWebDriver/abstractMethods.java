package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class abstractMethods {

	public static void main(String[] args) throws Exception {
		/*
		 * 6.manage() - it is used to manage window 7.switch() - it is using to
		 * switching from one window to antother window / alert / popups. 8.close() - to
		 * close the current window 9.quit() - to close all opened windows
		 * 
		 */
		ChromeOptions co = new ChromeOptions();
		co.addArguments(" --remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https:amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		 driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https:facebook.com");
		Thread.sleep(4000);
		 driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://google.com");
		Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https:myntra.com");
		Thread.sleep(4000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		;
	}

}
