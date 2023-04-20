package Webpages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestions {

	public static void main(String[] args) throws Exception {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://amazon.com");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("redmi");
		Thread.sleep(2000);

//		List<WebElement> sug=driver.findElements(By.xpath("//div[@class='pcTkSc']"));
//		int load=sug.size();
//		System.out.println(load);
//		for(WebElement ele:sug) {
//			System.out.println(ele.getText());
//			if(ele.getText().equals("ipl schedule")) {
//				ele.click();	
//				break;
//			}
//		}
//		driver.close();
		List<WebElement> ele = driver.findElements(By.xpath("//*[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		int size = ele.size();
		System.out.println(size);
		for (WebElement text : ele) {
			String pri = text.getText();
			System.out.println(pri);
			if (pri.equals("redmi note 11")) {
				text.click();
				break;
			}
		}
		driver.close();
	}

}
