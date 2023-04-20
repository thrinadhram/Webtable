package MethodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagName_Attribute {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumApplication\\Selenium\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> list=driver.findElements(By.xpath("//span[@class='sc-gswNZR HQNKF']"));
		WebElement tag=driver.findElement(By.xpath("//span[@class='sc-gswNZR HQNKF']"));
		
		System.out.println("using element "+tag.getTagName()+"used attribute "+tag.getAttribute("class"));
		System.out.println(" ");
		//int size=list.size();
		System.out.println("elements size are: "+list.size());
		System.out.println("------------------");
		//String element=tag.getTagName();
		//String attr=tag.getAttribute("class");
		
		for(WebElement element:list) {
			System.out.println(element.getText());
		}
		driver.close();		
	}
	}


