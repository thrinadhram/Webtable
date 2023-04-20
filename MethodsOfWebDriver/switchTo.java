package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class switchTo {

	public static void main(String[] args) throws Exception {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https:google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://ajio.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("current tab closed");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("all tabs are closed");
	}

}
