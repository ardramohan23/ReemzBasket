package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.LogoReemz;

public class LogoReemzTest extends BaseClass{
	
	
	@Test
	public void logotest() {
		LogoReemz ob=new LogoReemz(driver);
		ob.logoTest();
	}

}
