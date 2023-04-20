package Webpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class readData {

	public static void main(String[] args) throws IOException, Exception {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		
		//to get the workspace location
		String path=System.getProperty("user.dir");
		// to reduce the length of the path we may use getProperty();
		//File f=new File("E:\\SeleniumApplication\\Selenium\\Configuration\\config.properties");
		File f=new File(path+"\\Configuration\\config.properties");
		System.out.println(path);
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		String app=prop.getProperty("url");
		driver.manage().window().maximize();
		driver.get(app);
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
