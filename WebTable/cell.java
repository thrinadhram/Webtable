package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cell {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		
	
		WebDriver driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@class='tg']//tbody//tr"));
		System.out.println(row.size());
		for(int i=2;i<row.size();i++) {
			List<WebElement> col=driver.findElements(By.xpath("//table[@class='tg']//tbody//tr//td"));
			for(int j=1;j<col.size();j++) {
				if(i==5&&j==5) {
					WebElement node=driver.findElement(By.xpath("//table[@class='tg']//tbody//tr["+i+"]//td["+j+"]"));
					System.out.println(node.getText());
				}
			}
		}
		driver.close();

	}

}
