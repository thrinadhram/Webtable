package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class static02 {
	public static void main(String[] args) throws Exception {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.dezlearn.com/webtable-example/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement table = driver.findElement(By.xpath("//table[@class='tg']//tbody"));
		List<WebElement> head = table.findElements(By.xpath("//table[@class='tg']//tbody//tr//th"));
		int heads = head.size();
		System.out.println("total heads are: "+heads);
		for (int i = 0; i < heads; i++) {
			String loc = head.get(i).getText();
			System.out.println(i + ". " + loc);
			System.out.println(" ");
		}

		List<WebElement> row = table.findElements(By.xpath("//table[@class='tg']//tbody//tr"));
		int rows=row.size();
		System.out.println("total rows are: "+rows);
		for (int i = 0; i < rows; i++) {
			String load = row.get(i).getText();
			System.out.println(i + ". " + load);
		}

		List<WebElement> col = table.findElements(By.xpath("//table[@class='tg']//tbody//tr//td"));
		int cell=col.size();
		System.out.println("total cells are: "+cell);
		for (int i = 0; i <= col.size(); i++) {
			String data = col.get(i).getText();
			System.out.println(i + ". " + data);
		}
		
		driver.close();

	}

}
