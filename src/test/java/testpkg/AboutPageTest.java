package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.AboutPage;

public class AboutPageTest extends BaseClass {
	
	@Test
	public void aboutTest() {
		AboutPage ap=new AboutPage(driver);
		ap.pageValidation();
	}

}
