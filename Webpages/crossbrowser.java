package Webpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class crossbrowser {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		
		
		String path=System.getProperty("user.dir");
		File f=new File(path+"\\facebook\\fb.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		String browse=prop.getProperty("browser");
		System.out.println(browse);
		
		if(browse.equalsIgnoreCase("Chrome")) {
			ChromeOptions cpo=new ChromeOptions();
			cpo.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(cpo);
		}else if(browse.equalsIgnoreCase("Firefox")){
			FirefoxOptions fo=new FirefoxOptions();
			fo.addArguments("--remote-allow-origins=*");
			driver=new FirefoxDriver(fo);
		}else if(browse.equalsIgnoreCase("Edge")){
			EdgeOptions eo=new EdgeOptions();
			eo.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver(eo);
		}else {
			System.out.println("sorry you are choosen wrong browser");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.close();
			


	}

}
