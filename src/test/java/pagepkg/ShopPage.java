package pagepkg;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ShopPage {
	
	static WebDriver driver;
	Logger LOGGER=Logger.getLogger(ShopPage.class.getName());
	@FindBy(xpath="/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[4]")
	WebElement shoplabel;
	@FindBy(xpath="//*[@id=\"sort-grid\"]/div")
	WebElement products;
	@FindBy(id="submit_button")
	static
	WebElement addToCart;
	
	
	
	public ShopPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void shopDropdownTest() {
		
		 shoplabel.click();
		    List<WebElement> list = shoplabel.findElements(By.tagName("a"));
		    for (WebElement ele : list) {
		        System.out.println(ele.getText());
		        if(!(ele.getText()=="Shop")) {
      	        ele.click();
		        List<WebElement> allproducts = products.findElements(By.tagName("a"));
		        for(WebElement product:allproducts) {
		        	String productName=product.getText();
		        	product.click();
		        	addingCart(productName);
		        }
//		      
      	     
		    }
		}
		
}
	public static void addingCart(String productName) {
		
		try {
			String expected="https://reemzbasket.com/cartlist";
			addToCart.click();
			String actual=driver.getCurrentUrl();
			if(expected.equals(actual)) {
			System.out.println("Added "+productName+" successfully");
			}
			else {
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)	;
				FileHandler.copy(src, new File("./Screenshots/"+productName+".png"));
			}
		}catch(Exception e) {
			e.getMessage();
		}
		
		
	}
}
