package Webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdownHandles {

	public static void main(String[] args) throws Exception {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://globalsqa.com/demo-site/select-dropdown-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement dropdown = driver.findElement(By.tagName("select"));
		Select dd = new Select(dropdown);
		// dd.selectByVisibleText("Australia");

		// to get total dropdown count and all names of the dropdown list
		List<WebElement> menu = dd.getOptions();
		int num = menu.size();
		System.out.println(num);
		for (int i = 0; i < num; i++) {
			String data = menu.get(i).getText();
			System.out.println(i + ". " + data);
		}
		
		// dd.selectByIndex(80);
		dd.selectByValue("AIA");
		Thread.sleep(3000);

		driver.close();

	}

}
