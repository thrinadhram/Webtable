package Launch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo {

	public static void main(String[] args) throws Exception {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dezlearn.com/webtable-example/");
		for(int i=1;i<=7;i++) {
			WebElement ele=driver.findElement(By.xpath("//table[@class='tg']//tbody//tr["+i+"]//td[1]"));
			System.out.println(ele.getText());
		
		}	
		driver.close();	
		
		
		
//		for(int i=0;i<row.size();i++) {
//		List<WebElement> col=table.findElements(By.tagName("td"));
//			for(int j=0;j<col.size();j++) {
//				if(i==5&&j==5) {
//					WebElement ele=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
//					ele.sendKeys("Welcome");
//					List<WebElement> tab=driver.findElements(By.xpath("//table[@class='tg']/tbody/tr[6]"));
//					for(int s=0;s<tab.size();s++) {
//						String data=tab.get(s).getText();
//						System.out.println(data);
//						
//					}

				
						
	
	
	
	}
}