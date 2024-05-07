package pagepkg;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PreOrderPage {
	
	WebDriver driver;
	Logger LOGGER=Logger.getLogger(PreOrderPage.class.getName());
	@FindBy(xpath="/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")
	WebElement preorder;
	
	
	public PreOrderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void linkValidation() {
		String exp="https://reemzbasket.com/preorder-productlist";
		preorder.click();
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, exp);
		LOGGER.info("Preorder redirected successfully");
		
	}
	
	

}
