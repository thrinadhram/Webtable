package Launch;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class index {
	public static void main(String[] args) throws Exception{
	
	//co.setAcceptInsecureCerts(false);
	//*[.='Registry']==>xpath
	
		ChromeOptions co	=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://monster.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	String parent=driver.getWindowHandle();
	System.out.println(parent);
	
	WebElement register= driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[1]/div"));
	//Thread.sleep(3000);
	Actions act = new Actions(driver);
	act.moveToElement(register).click().build().perform();
	Thread.sleep(3000);
	
	WebElement facebook =driver.findElement(By.xpath("/html/body/div[3]/div/section/div/div[1]/div[2]/div[2]/div[3]"));
	
	Actions act1 = new Actions(driver);
	act.moveToElement(facebook).click().build().perform();
	
	Set<String> child=driver.getWindowHandles();
	Iterator<String> window=child.iterator();
	String window1=window.next();
	String window2=window.next();
	driver.switchTo().window(window2);
	
	//System.out.println();
	//String child1=driver.getWindowHandle();
	
	
//for(String load:child) {
//		System.out.println(load);
//		if(!parent.equals("child")) {
//			driver.switchTo().window("child2");
//
//			}
		
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("12345465");
	
	Thread.sleep(5000);
	driver.switchTo().window(window1);
	driver.switchTo().defaultContent();	
	
}
	}

	
	
	
//	 driver.findElement(By.xpath("/html/body/div[3]/div/section/div/div[1]/div[2]/div[2]/div[3]")).isDisplayed();
//	driver.findElement(By.xpath("/html/body/div[3]/div/section/div/div[1]/div[2]/div[2]/div[3]")).click();
//	Thread.sleep(3000);
//
//	register.click();
//	//facebook.click();
//	
//	driver.close();
	
		
		


		


