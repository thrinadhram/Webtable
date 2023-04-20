package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Static01
{

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		co.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.seleniumeasy.com/table-pagination-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table=driver.findElement(By.xpath("//table[@class='table table-hover']"));
		List<WebElement> row=table.findElements(By.tagName("tr"));
		System.out.println("-------------------------------");
		System.out.println("total rows in a table :"+row.size());
		System.out.println("-------------------------------");
		for(int i=0;i<row.size();i++) {
			String tabe=row.get(i).getText();
			System.out.println(i+". "+tabe);
		}
		
		List<WebElement> head=table.findElements(By.tagName("th"));
		System.out.println("-------------------------------");
		System.out.println("total Header in a table :"+head.size());
		System.out.println("-------------------------------");
		for(int i=0;i<head.size();i++) {
			String Head=head.get(i).getText();
			System.out.println(i+". "+Head);
		}
		
		List<WebElement> col=table.findElements(By.tagName("td"));
		System.out.println("-------------------------------");
		System.out.println("total cols in a table :"+col.size());
		System.out.println("-------------------------------");
		for(int i=0;i<col.size();i++) {
			String Cols=col.get(i).getText();
			System.out.println(i+". "+Cols);
		}
		
		driver.close();

	}

}
