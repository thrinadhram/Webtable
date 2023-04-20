package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumApplication\\Selenium\\Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Register")).click();
		WebElement radio=driver.findElement(By.id("gender-male"));
		WebElement Firstname=driver.findElement(By.id("FirstName"));
		WebElement LastName=driver.findElement(By.id("LastName"));
		WebElement Email=driver.findElement(By.id("Email"));
		WebElement Submit=driver.findElement(By.id("register-button"));
		
		Submit.click();
		Thread.sleep(3000);
		radio.click();
		Firstname.sendKeys("Thulasi");
		LastName.sendKeys("Rao");
		Email.sendKeys("@gmail.com");
		Thread.sleep(3000);
		Email.clear();
		Submit.submit();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(4000);
		driver.close();
		

	}

}
