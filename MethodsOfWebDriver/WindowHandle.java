package MethodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		/*
		 * 10.getWindowHandle() - using to handle the single window address
		 * 11.getWindowHandles() - using to hnadle multiple window address
		 */
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String addr=driver.getWindowHandle();
		System.out.println("the address of this page is: "+addr);
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://amazon.in");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://myntra.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://ajio.com");
		String address=driver.getWindowHandle();
		System.out.println(address);
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://nykaafashion.com");
		title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);

		//to get the total pages in a window
		Set<String> windows=driver.getWindowHandles();
		int data=windows.size();
		System.out.println("the total oppened tabs are: "+data);

		Thread.sleep(5000);
		driver.quit();

	}

}
