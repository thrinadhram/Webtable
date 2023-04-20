package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class rows {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dezlearn.com/webtable-example/");

		List<WebElement> row = driver.findElements(By.xpath("//table[@class='tg']//tbody//tr"));
		for (int i = 1; i <= row.size(); i++) {
			WebElement ele = driver.findElement(By.xpath("//table[@class='tg']//tbody//tr[" + i + "]"));
			System.out.println(ele.getText());
			System.out.println("row data: 1");

		}
		for (int i = 2; i <= row.size(); i++) {
			WebElement ele = driver.findElement(By.xpath("//table[@class='tg']//tbody//tr[" + i + "]"));
			System.out.println(ele.getText());
			System.out.println("row data: 2");

		}
		for (int i = 3; i <= row.size(); i++) {
			WebElement ele = driver.findElement(By.xpath("//table[@class='tg']//tbody//tr[" + i + "]"));
			System.out.println(ele.getText());
			System.out.println("row data: 3");

		}
		for (int i = 4; i <= row.size(); i++) {
			WebElement ele = driver.findElement(By.xpath("//table[@class='tg']//tbody//tr[" + i + "]"));
			System.out.println(ele.getText());
			System.out.println("row data: 4");

		}
		for (int i = 5; i <= row.size(); i++) {
			WebElement ele = driver.findElement(By.xpath("//table[@class='tg']//tbody//tr[" + i + "]"));
			System.out.println(ele.getText());
			System.out.println("row data: 5");

		}
		for (int i = 6; i <= row.size(); i++) {
			WebElement ele = driver.findElement(By.xpath("//table[@class='tg']//tbody//tr[" + i + "]"));
			System.out.println(ele.getText());
			System.out.println("row data: 6");

		}
		for (int i = 7; i <= row.size(); i++) {
			WebElement ele = driver.findElement(By.xpath("//table[@class='tg']//tbody//tr[" + i + "]"));
			System.out.println(ele.getText());
			System.out.println("row data: 7");

		}
		driver.close();
	}
}
