package Webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElements {

	public static void main(String[] args) throws Exception {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Baby")).click();
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		List<WebElement> check=driver.findElements(By.xpath("//span[@class='a-size-base a-color-base']"));
		int load=check.size();
		System.out.println("the webElements are: "+load);
		for(int i=0;i<load;i++) {
			String cbl=check.get(i).getText();
			System.out.println(i+". "+cbl);
			
		}
		Thread.sleep(2000);
		driver.close();

	}

}
