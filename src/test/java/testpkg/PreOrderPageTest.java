package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.PreOrderPage;

public class PreOrderPageTest extends BaseClass{
	
	@Test
	public void preorderTest() {
		PreOrderPage po=new PreOrderPage(driver);
		po.linkValidation();
	}

}
