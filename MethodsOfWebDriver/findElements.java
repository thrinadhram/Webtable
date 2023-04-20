package MethodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElements {

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver","E:\\SeleniumApplication\\Selenium\\Browser\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments(" --remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://myntra.com");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		List<WebElement> meshoo=driver.findElements(By.xpath("//*[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK']//child::span"));
		int data=meshoo.size();
		System.out.println("the Webelements are:"+data);
		System.out.println("------------------");
		for(WebElement element:meshoo) {
			System.out.println(element.getText());
			
		}
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		String page=driver.getTitle();
		System.out.println(" ");
		System.out.println(page);
		List<WebElement> myntra=driver.findElements(By.xpath("//a[@class='desktop-main']"));
		int count=myntra.size();
		System.out.println("the Webelements are:"+count);
		System.out.println("------------------");
		for(WebElement raw:myntra) {
			System.out.println(raw.getText());
		}
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.get("https://www.ajio.com/");
		String load=driver.getTitle();
		System.out.println(" ");
		System.out.println(load);
		Thread.sleep(2000);
		List<WebElement> end=driver.findElements(By.xpath("//a[@class=' alignTag']"));
		int records=end.size();
		System.out.println("the elements size are: "+records);
		System.out.println("------------------");
		
		for(WebElement ajio:end) {
			System.out.println(ajio.getText());
		}
		driver.close();
	}

}
