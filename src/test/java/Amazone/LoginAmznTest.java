package Amazone;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.base;
import Utility.dataProvider;

public class LoginAmznTest extends base {
	
	
	public WebDriver driver;
	
	@BeforeTest
	
	public void InitialSetup() throws IOException {
		
		driver= IntialSetup();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url1"));
}
	
	@Test(dataProvider="getLogindata")
	
	public void getLogin(String UserName, String Password)
	{
		LandinAmznPage lp = new LandinAmznPage(driver);
		lp.getSignIn();
		LoginAmznPage lo=new LoginAmznPage(driver);
		lo.getEmailId().sendKeys(UserName);
		lo.getContinueBttn().click();
		Login2AmznPage lo1=new Login2AmznPage(driver);
		lo1.getPassword().sendKeys(Password);
		lo1.getLoginButton().click();
		Assert.assertEquals(lp.getLoginDetails(), "Hello, Resmi");
		
	}
	
	@DataProvider
	public Object[][] getLogindata() {
		Object[][] Obj=dataProvider.getLoginData();	
		return Obj;
	}
	
	@AfterTest
	public void TearDown() {
		tearDown();
		
	}

}
