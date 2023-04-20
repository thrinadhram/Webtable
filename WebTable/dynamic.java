package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dynamic {

	public static void main(String[] args) throws Exception {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dezlearn.com/webtable-example/");
		WebElement table=driver.findElement(By.xpath("//table[@class='tg']//tbody"));
		
		List<WebElement> row=table.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++) {
			List<WebElement> col=table.findElements(By.tagName("td"));
				for(int j=0;j<col.size();j++) {
					if(i==5&&j==2) {
					WebElement ss=	driver.findElement(By.xpath("//table[@class='tg']//tbody//tr["+i+"]/td["+j+"]"));
					System.out.println(ss.getText());
					}
				}
		}
		
		driver.close();
	}

}
