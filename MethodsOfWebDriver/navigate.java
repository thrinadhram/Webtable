package MethodsOfWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class navigate{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumApplication\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	/*
	 1.get- to launch the browser
	 2.navigate().to()- it is also launch the browser
	 	back()- backward
	 	forward()-forward
	 	refresh()-refresh the page
	 3.getTitle()- it is used to read the current title of the page
	 4.getCurrentUrl()- it is used to read the Current page of the url
	 5.getPageSource()-it is used to read the page source the domain
	 
	 
	*/
		String title="";
		String url="";
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		
		driver.navigate().to("https://nykaafashion.com");
		title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		
		driver.navigate().back();
		url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(4000);
		
		driver.navigate().forward();
		url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		title=driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
		
	}

}
