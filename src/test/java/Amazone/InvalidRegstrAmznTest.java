package Amazone;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.base;

public class InvalidRegstrAmznTest extends base {
	
	

	@BeforeTest
	
public void InitialSetup() throws IOException {
		
		driver= IntialSetup();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url1"));
}
	@Test
	
	public void invalidRegistration() throws InterruptedException {
	
		LandinAmznPage lp = new LandinAmznPage(driver);
		lp.getSignInPage();
		RegisterPage rp=new RegisterPage(driver);
		rp.getcontinueButton().click();
		Assert.assertEquals(rp.getFirstNameAlert(), "Enter your name");
		Assert.assertEquals(rp.getPhoneAlert(), "Enter your mobile number");
		Assert.assertEquals(rp.getPswrdAlert(), "Enter your password");
		rp.getYourName().sendKeys("&&%$hfff");
		rp.getPhoneNumber().sendKeys("&^&hghghf");
		rp.getPassword().sendKeys("123456");
		rp.getcontinueButton().click();
		Assert.assertEquals(rp.getInvalidPhoneAlert(), "The mobile number you entered does not seem to be valid");
	}
	
	@AfterTest
	public void TearDown() {
		tearDown();
		
	}
	}


