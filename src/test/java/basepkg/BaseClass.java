package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
    String url="https://reemzbasket.com/";
	
	@BeforeTest
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		Thread.sleep(7000);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void gearDown() {
		driver.quit();
	}

}
