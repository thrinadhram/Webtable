package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) throws Exception {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		Actions act = new Actions(driver);
//		WebElement ele = driver.findElement(By.xpath("//span[text()='Women Western']"));
//		act.moveToElement(ele).build().perform();
//		act.contextClick().build().perform();
//		act.doubleClick().build().perform();
//		Thread.sleep(5000);
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://demoqa.com/droppable");
//		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
//		act.dragAndDrop(drag, drop).build().perform();
//		Thread.sleep(5000);
//		
		
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Women Western']"));
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//*[contains(text(),'Shorts')])[1]")).click();
		Thread.sleep(5000);
		
		
		driver.quit();

	}

}
