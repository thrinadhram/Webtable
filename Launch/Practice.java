package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumApplication\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://google.com");
//		driver.manage().window().maximize();
//		String cur=driver.getCurrentUrl();
//		System.out.println(cur);
//		Thread.sleep(5000);
//		driver.close();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String obj=driver.getWindowHandle();
		System.out.println(obj);
		
		
	}

}
