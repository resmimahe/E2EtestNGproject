package Amazone;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.base;

public class InvalidLoginAmznTest extends base {
	
	
	@BeforeTest
	
public void InitialSetup() throws IOException {
		
		driver= IntialSetup();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url1"));
}
	@Test
	
	public void invalidLoginUser() throws InterruptedException {
		
		LandinAmznPage lp = new LandinAmznPage(driver);
		lp.getSignIn();
		LoginAmznPage lo=new LoginAmznPage(driver);
		lo.getContinueBttn().click();
		Thread.sleep(1000);
		Assert.assertEquals(lo.getUserAlertMsg(), "Enter your email or mobile phone number");
		lo.getEmailId().sendKeys("dummyUserName");
		lo.getContinueBttn().click();
		Thread.sleep(1000);
		Assert.assertEquals(lo.getAlertTitle(), "There was a problem");
		Thread.sleep(1000);
		Assert.assertEquals(lo.getAlertMsg(),"We cannot find an account with that email address");
		
	}
	
	@Test
	
	public void invalidPwd() {
		LandinAmznPage lp = new LandinAmznPage(driver);
		lp.getSignIn();
		LoginAmznPage lo=new LoginAmznPage(driver);
		lo.getEmailId().sendKeys("8137853979");
		Login2AmznPage lo1=new Login2AmznPage(driver);
		lo1.getLoginButton().click();
		Assert.assertEquals(lo1.getInvalidAlert(),"Enter your password");
		lo.getEmailId().sendKeys("Resh@77777");
		Assert.assertEquals(lo1.getAlertTitle(), "There was a problem");
		Assert.assertEquals(lo1.getAlertMsg(), "Your password is incorrect");
		
	}
	
	@AfterTest
	public void TearDown() {
		//tearDown();
		
	}

}
