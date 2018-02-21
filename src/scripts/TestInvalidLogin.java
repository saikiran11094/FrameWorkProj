package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestInvalidLogin extends BaseTest
{
	@Test
	public void testInavalidLogin() throws InterruptedException
	{
		LoginPage l = new LoginPage(driver);
		int rowCount = Lib.getRowCount("InvalidLogin");
		
		
		for (int i = 1; i < rowCount; i++)
		{
			//LoginPage l = new LoginPage(driver);
			String username = Lib.getCellValue("InvalidLogin", i, 0);
			l.setUsername(username);
			Thread.sleep(1000);
			String password = Lib.getCellValue("InvalidLogin", i, 1);
			l.setPassword(password);
			l.clickLogin();
		}

	}
}