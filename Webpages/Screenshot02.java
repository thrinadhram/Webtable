package Webpages;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Screenshot02 {

	public static void main(String[] args) throws Exception {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String path=System.getProperty("user.dir");
		System.out.println(path);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File(path+"\\Screenshot\\Men.png");
		Files.copy(src, des);
		driver.close();

	}

}
