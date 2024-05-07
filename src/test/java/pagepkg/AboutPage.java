package pagepkg;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AboutPage {
	
	WebDriver driver;
	Logger LOGGER=Logger.getLogger(AboutPage.class.getName());
	@FindBy(xpath="/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[2]/a")
	WebElement about;
	
	public AboutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void pageValidation() {
		String exp="https://reemzbasket.com/about";
		about.click();
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, exp);
		LOGGER.info("About when clicked redirected successfully");
		
	}
	

}
