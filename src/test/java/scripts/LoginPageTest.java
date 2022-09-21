package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.TestBase;
import pom.EnterTimeTrack;
import pom.LoginPage;
//login scritp
public class LoginPageTest extends TestBase {
	
	@Test
	public void validLogin() throws Exception {
		LoginPage l=new LoginPage(driver);
		l.enterUserName("admin");
		l.enterPassword("manager");
		l.clickOnLoginBtn();
		EnterTimeTrack e=new EnterTimeTrack(driver);
		//Thread.sleep(10000);
		Assert.assertEquals(e.getTitle(), "actiTIME - Enter Time-Track","Title is not Matching");
	}
}
