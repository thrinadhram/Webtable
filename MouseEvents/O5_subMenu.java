package MouseEvents;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class O5_subMenu {

	public static void main(String[] args) throws Exception {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[text()='MEN']"));
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("(//*[contains(text(),'Watches')])[1]")).click();
		Thread.sleep(2000);
		
		WebElement women=driver.findElement(By.xpath("//a[text()='WOMEN']"));
		act.moveToElement(women).build().perform();
		driver.findElement(By.xpath("(//*[contains(text(),'Sarees')])[1]")).click();
		Thread.sleep(3000);
		
		WebElement kids=driver.findElement(By.xpath("//a[text()='KIDS']"));
		act.moveToElement(kids).build().perform();
		driver.findElement(By.xpath("(//*[contains(text(),'Shirts Under 599')])[1]")).click();
		driver.findElement(By.xpath("(//img[@class='rilrtl-lazy-img  rilrtl-lazy-img-loaded'])[1]")).click();
		Thread.sleep(4000);
		
		driver.close();		
	}

}
