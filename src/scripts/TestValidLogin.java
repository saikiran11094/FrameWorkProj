package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest {
    @Test
	public void testValidLogin() throws InterruptedException{
	
    	LoginPage l = new LoginPage(driver);
    	String username = Lib.getCellValue("ValidLogin", 1, 0);
    	l.setUsername(username);
    	Thread.sleep(4000);
    	String password = Lib.getCellValue("ValidLogin", 1, 1);
    	l.setPassword(password);
    	Thread.sleep(4000);
    	l.clickLogin();
    	
}
}
