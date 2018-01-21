package scripts;

import org.testng.annotations.Test;

import generic.Init_Test;
import pom.ActiTime_Home_Page;
import pom.ActiTime_Login_Page;

public class ValidLoginLogout extends Init_Test
{
	@Test
	public void testValidLoginLogout()
	{
		ActiTime_Login_Page l1=new ActiTime_Login_Page(driver);
		l1.enterUN("admin");
		l1.enterPWD("manager");
		l1.clickLogin();
		
		ActiTime_Home_Page h1=new ActiTime_Home_Page(driver);
		h1.clickLogout();
	}
}
