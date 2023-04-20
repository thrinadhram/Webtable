package Webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isDisplayed {

	public static void main(String[] args) throws Exception {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		System.out.println(title);
		List<WebElement> pages=driver.findElements(By.tagName("a"));
		int load=pages.size();
		System.out.println("the toal links are: "+load);
		int count=0;
		for(WebElement node:pages) {
			if(node.isDisplayed()) {
				count++;
				
			}
			
			System.out.println(node.getText());
			
		}
		System.out.println("the non-visible links are: "+(load-count));
		Thread.sleep(4000);
		driver.close();
	

	}

}
