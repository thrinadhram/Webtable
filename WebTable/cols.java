package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cols {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		System.out.println("Col: 1 ");
		System.out.println(" ");
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='tg']//tbody//tr"));
		for(int i=2;i<=row.size();i++) {
			WebElement ele=driver.findElement(By.xpath("//table[@class='tg']//tbody//tr["+i+"]//td[1]"));
			System.out.println(ele.getText());
//			if(ele.getText().equals("Tim Watson")) {
//				System.out.println("found "+ele.getText());
//				break;
//			}
			
		}
		System.out.println(" ");
		System.out.println("Col: 2 ");
		System.out.println(" ");
		for(int i=2;i<=7;i++) {
			WebElement ele=driver.findElement(By.xpath("//table[@class='tg']//tbody//tr["+i+"]//td[2]"));
			System.out.println(ele.getText());
			
		}
		driver.close();
	}

}
