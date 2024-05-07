package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.ShopPage;

public class ShopPageTest extends BaseClass{
	
	@Test
	public void preorderTest() {
		ShopPage sh=new ShopPage(driver);
		sh.shopDropdownTest();
		
	}

}
