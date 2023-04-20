package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TEST01 {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--start-maximized");
		 driver=new ChromeDriver(co);
		
	}
	@Test(priority=1)
  public void linkTest() {
		driver.get("https://google.com");
		

	}@Test(priority=2)
	public void titleTest() {
		String actTitle=driver.getTitle();
		String expTitle="Google";
		String msg="someting went wrong";
		Assert.assertEquals(expTitle, actTitle,msg);
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
