package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class validatetitle {

	public static void main(String[] args) throws Exception {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		String expTitle="Google";
		String CurrentTitle=driver.getTitle();
		Thread.sleep(5000);
		
//		if(expTitle.equals(CurrentTitle))
		if(expTitle.contains(CurrentTitle)){
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		
		driver.close();
	}

}
